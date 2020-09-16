package com.codecool.restapi.servlet;

import com.codecool.restapi.dbconnection.Dao;
import com.codecool.restapi.model.Wheel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(name = "wheel", urlPatterns = {"/wheels", "/wheels/*"})
public class WheelServlet extends HttpServlet {

    private Dao<Wheel> dao = new Dao<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String title = "GET method with parameters to display";

        List<Wheel> allWheels = dao.getAll(Wheel.class);
        String wheels = "";
        for (Wheel wh :
                allWheels) {
            wheels += "next wheel: " + wh.getId() + " "+wh.getDiameter()+" " + wh.getWidth()+"<br>"+"\n";
        }
        out.println(
                "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body>\n" +
                        "<h1 align = \"center\">" + title + "</h1>\n" +
                        "<div><p>" +
                        wheels +
                        "</p></div>" +
                        "</body></html>"
        );
    }
}
