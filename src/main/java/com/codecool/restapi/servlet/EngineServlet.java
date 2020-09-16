package com.codecool.restapi.servlet;

import com.codecool.restapi.model.Engine;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/engines")
public class EngineServlet extends HttpServlet {

    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Engine engine = new Engine(2.2f, 300);
        engine.setId(1);
        String engineJsonString = this.gson.toJson(engine);
        System.out.println(engineJsonString);

//        String engineJsonString = "{\"name\":\"John\", \"age\":31, \"city\":\"New York\"}";

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(engineJsonString);
        out.flush();
        //System.out.println("DO GET");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("DO POST");
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("DO PUT");
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("DO DELETE");
    }

}
