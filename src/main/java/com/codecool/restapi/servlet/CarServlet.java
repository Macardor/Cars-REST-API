package com.codecool.restapi.servlet;

import com.codecool.restapi.dbconnection.Dao;
import com.codecool.restapi.dbconnection.DaoImpl;
import com.codecool.restapi.helpers.IdHandler;
import com.codecool.restapi.model.Car;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CarServlet", urlPatterns = {"/cars", "/cars/*"})
public class CarServlet extends HttpServlet {

    private Gson gson = new Gson();
    private Dao<Car> dao = new DaoImpl<>(Car.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carJsonString;
        long id = IdHandler.getIdFromURL(request.getRequestURI());

        if(IdHandler.providedIdIsProper(id)){
            Car car = dao.get(id);
            carJsonString = this.gson.toJson(car);
        }else{
            List<Car> cars =  dao.getAll();
            carJsonString = this.gson.toJson(cars);
        }

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(carJsonString);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Car car = this.gson.fromJson(IdHandler.getJsonStringFromRequest(request), Car.class);
        if (carHasAtLeastOneEngineAndWheelObject(car)) dao.add(car);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Car car = this.gson.fromJson(IdHandler.getJsonStringFromRequest(request), Car.class);
        long id = IdHandler.getIdFromURL(request.getRequestURI());
        if(IdHandler.providedIdIsProperAndEquals(id, car.getId())){
            if (carHasAtLeastOneEngineAndWheelObject(car)) dao.update(car);
        }else{
            System.out.println("\n\n#################################\n");
            System.out.println("No proper id provided to update record");
            System.out.println("\n#################################\n\n");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        long id = IdHandler.getIdFromURL(request.getRequestURI());
        if(IdHandler.providedIdIsProper(id)){
            dao.delete(id);
        }else{
            System.out.println("\n\n#################################\n");
            System.out.println("No id provided to delete record");
            System.out.println("\n#################################\n\n");
        }
    }

    private boolean carHasAtLeastOneEngineAndWheelObject(Car car) {
        if (car.getEngines().size() == 0) return false;
        return (car.getWheels().size() != 0);
    }

}
