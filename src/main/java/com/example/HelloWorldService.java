package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldService {
    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    @WebMethod
    public String getDateTime() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        return dateFormat.format(date);
    }
}
