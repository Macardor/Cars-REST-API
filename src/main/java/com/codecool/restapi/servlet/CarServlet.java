package com.codecool.restapi.servlet;

import com.codecool.restapi.dbconnection.Dao;
import com.codecool.restapi.model.Car;
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

@WebServlet(name = "CarServlet", urlPatterns = {"/cars", "/cars/id"})
public class CarServlet extends HttpServlet {

    private Gson gson = new Gson();
    private Dao dao = new Dao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String url = getUrlFromRequest(request);
        String carJsonString;
        long id;

        if(getIdFromURL(url) != 0L){
            id = getIdFromURL(url);
            Car car = (Car) dao.get(Car.class, id);
            carJsonString = this.gson.toJson(car);
        }else{
            List<Car> cars =  dao.getAll(Car.class);
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
        String carJsonString = this.gson.toJson(getJsonStringFromRequest(request));
        Car car = this.gson.fromJson(carJsonString, Car.class);
        dao.add(car);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String carJsonString = this.gson.toJson(getJsonStringFromRequest(request));
        Car car = this.gson.fromJson(carJsonString, Car.class);
        dao.update(car);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        String url = getUrlFromRequest(request);

        long id;

        if(getIdFromURL(url) != 0L){
            id = getIdFromURL(url);
            dao.delete(Car.class, id);
        }else{
            System.out.println("No id provided to delete record");
        }
    }

    private String getUrlFromRequest(HttpServletRequest request){
        String url;
        url = (String) request.getAttribute("javax.servlet.forward.request_uri");
        url = url == null ? request.getRequestURI() : url;
        return url;
    }

    private long getIdFromURL(String url){
        List<String> splittedUrl = Arrays.asList(url.split("/"));
        if (splittedUrl.size() == 4){
            return Long.parseLong(splittedUrl.get(3));
        }
        return 0L;
    }

    private String getJsonStringFromRequest(HttpServletRequest request) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        BufferedReader bufferedReader = request.getReader();
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
}
