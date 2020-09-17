package com.codecool.restapi.servlet;

import com.codecool.restapi.dbconnection.Dao;
import com.codecool.restapi.dbconnection.DaoImpl;
import com.codecool.restapi.helpers.IdHandler;
import com.codecool.restapi.model.Wheel;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(name = "wheel", urlPatterns = {"/wheels", "/wheels/*"})
public class WheelServlet extends HttpServlet {

    private Gson gson = new Gson();
    private Dao<Wheel> dao = new DaoImpl<>(Wheel.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        long id = IdHandler.getIdFromURL(request.getRequestURI());
        String wheelsJsonString;

        if(id != 0L){
            Wheel wheel = dao.get(id);
            wheelsJsonString = this.gson.toJson(wheel);
            System.out.println("\n\n#################################\n");
            System.out.println(wheelsJsonString);
            System.out.println("\n\n#################################\n");
        }else{
            List<Wheel> wheels =  dao.getAll();
            wheelsJsonString = this.gson.toJson(wheels);
        }

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(wheelsJsonString);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Wheel wheel = this.gson.fromJson(IdHandler.getJsonStringFromRequest(request), Wheel.class);
        dao.add(wheel);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Wheel wheel = this.gson.fromJson(IdHandler.getJsonStringFromRequest(request), Wheel.class);
        long id = IdHandler.getIdFromURL(request.getRequestURI());
        if(IdHandler.providedIdIsProper(id, wheel)){
            dao.update(wheel);
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

}
