package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App
{
public static String search(ArrayList<Integer> array, String str, int e, char c) {

        System.out.println("inside search");
        if (array == null) return "null integer list";
        if (str==null) return "empty string";
  
        //String intresult = "";
        int intfreq = 0;
        int charfreq=0;
       // String strresult = "";
        
        for (int elt : array) {
          if (elt == e) intfreq++;
        }
        str=str.toLowerCase();
        for (int i =0; i<str.length(); i++) {
        	if (str.charAt(i)==c) {
        		charfreq++;
        	}
        }
        
        
        return "frequency of the character "+c+" : "+charfreq+"\nfrquency of the int "+e+" : "+intfreq;
        
        
      }


    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
            String input1 = req.queryParams("input1");
            String input2 = req.queryParams("input2");
            String input3 = req.queryParams("input3");
            String input4 = req.queryParams("input4");

            java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
            String[] inputs = input1.split(",");
            for (String input : inputs) {
                inputList.add(Integer.parseInt(input.trim()));
            }

            char inputChar = input3.charAt(0);

            String result = App.search(inputList, input2, Integer.parseInt(input4), inputChar);

            Map<String, Object> map = new HashMap<>();
            map.put("result", result);
            return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute", (rq, rs) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("result", "not computed yet!");
            return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; // return default port if heroku-port isn't set (i.e. on localhost)
    }
}
