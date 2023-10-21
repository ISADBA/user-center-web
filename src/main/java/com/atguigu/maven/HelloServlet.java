package com.atguigu.maven;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.math.BigInteger;
import com.atguigu.maven.Calculate;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        try {
            Calculate calculate = new Calculate();
            int addRes = calculate.add(5, 5);
            resp.getWriter().write("5 + 5 = " + addRes);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}