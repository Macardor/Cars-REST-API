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

        if(id != 0L){
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
        String carJsonString = this.gson.toJson(IdHandler.getJsonStringFromRequest(request));
        Car car = this.gson.fromJson(carJsonString, Car.class);
        dao.add(car);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carJsonString = this.gson.toJson(IdHandler.getJsonStringFromRequest(request));
        Car car = this.gson.fromJson(carJsonString, Car.class);
        dao.update(car);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        long id = IdHandler.getIdFromURL(request.getRequestURI());
        if(id != 0L){
            dao.delete(id);
        }else{
            System.out.println("No id provided to delete record");
        }
    }

}
