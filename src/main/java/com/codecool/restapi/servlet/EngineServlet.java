package com.codecool.restapi.servlet;

import com.codecool.restapi.dbconnection.Dao;
import com.codecool.restapi.dbconnection.DaoImpl;
import com.codecool.restapi.helpers.IdHandler;
import com.codecool.restapi.model.Engine;
import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "EngineServlet", urlPatterns = {"/engines", "/engines/*"})
public class EngineServlet extends HttpServlet {

    private Gson gson = new Gson();
    private Dao<Engine> dao = new DaoImpl<>(Engine.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String engineJsonString;
        long id = IdHandler.getIdFromURL(request.getRequestURI());
        if(id != 0L){
            Engine engine = dao.get(id);
            engineJsonString = this.gson.toJson(engine);
        }else{
            List<Engine> engines =  dao.getAll();
            engineJsonString = this.gson.toJson(engines);
        }
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(engineJsonString);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String engineJsonString = this.gson.toJson(IdHandler.getJsonStringFromRequest(request));
        Engine engine = this.gson.fromJson(engineJsonString, Engine.class);
        dao.add(engine);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String engineJsonString = this.gson.toJson(IdHandler.getJsonStringFromRequest(request));
        Engine engine = this.gson.fromJson(engineJsonString, Engine.class);
        dao.update(engine);
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
