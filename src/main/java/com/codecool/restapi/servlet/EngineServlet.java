package com.codecool.restapi.servlet;

import com.codecool.restapi.dbconnection.Dao;
import com.codecool.restapi.model.Engine;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "EngineServlet", urlPatterns = {"/engines", "/engines/id"})
public class EngineServlet extends HttpServlet {

    private Gson gson = new Gson();
    private Dao dao = new Dao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = null;
        url = (String) request.getAttribute("javax.servlet.forward.request_uri");
        url = url == null ? request.getRequestURI() : url;
        List<String> splittedUrl = Arrays.asList(url.split("/"));

        String engineJsonString;
        long id;

        if(splittedUrl.size() == 4){
            id = Long.parseLong(splittedUrl.get(3));
            Engine engine = (Engine) dao.get(Engine.class, id);
            engineJsonString = this.gson.toJson(engine);
        }else{
            List<Engine> engines =  dao.getAll(Engine.class);
            engineJsonString = this.gson.toJson(engines);
        }

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(engineJsonString);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;

        BufferedReader bufferedReader = request.getReader();
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }

        String engineJsonString = this.gson.toJson(stringBuilder.toString());
        Engine engine = this.gson.fromJson(engineJsonString, Engine.class);
        dao.add(engine);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;

        BufferedReader bufferedReader = request.getReader();
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }

        String engineJsonString = this.gson.toJson(stringBuilder.toString());
        Engine engine = this.gson.fromJson(engineJsonString, Engine.class);
        dao.update(engine, Engine.class);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String url = null;
        url = (String) request.getAttribute("javax.servlet.forward.request_uri");
        url = url == null ? request.getRequestURI() : url;
        List<String> splittedUrl = Arrays.asList(url.split("/"));

        long id;

        if(splittedUrl.size() == 4){
            id = Long.parseLong(splittedUrl.get(3));
            dao.delete(Engine.class, id);
        }else{
            System.out.println("No id provided to delete record");
        }
    }

}
