package com.codecool.restapi.helpers;

import com.codecool.restapi.model.Wheel;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IdHandler {

    public static boolean providedIdIsProper(long id) {
        return id != 0L;
    }

    public static boolean providedIdIsProper(long id, Wheel wheel) {
        if (wheel.getId() != id) return false;
        return providedIdIsProper(id);
    }

    public static long getIdFromURL(String url){
        List<String> splittedUrl = Arrays.asList(url.split("/"));
        if (splittedUrl.size() == 3){
            return Long.parseLong(splittedUrl.get(2));
        }
        return 0L;
    }

    public static String getJsonStringFromRequest(HttpServletRequest request) throws IOException {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = request.getReader();
            while ((line = bufferedReader.readLine()) != null)
                stringBuilder.append(line);
        } catch (Exception e) { e.printStackTrace(); }
        List<String> splittedString = Arrays.asList(stringBuilder.toString().split(" "));
        //Print json string
        System.out.println(String.join("", splittedString));
        return String.join("", splittedString);
    }
}
