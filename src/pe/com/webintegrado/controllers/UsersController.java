package pe.com.webintegrado.controllers;

import pe.com.webintegrado.models.HrService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "UsersController", urlPatterns = "/users")
public class UsersController extends javax.servlet.http.HttpServlet {
    HrService service;
    String url;

    public UsersController() {
        super();
        service = new HrService();
        url = "";
    }

    private void processRequest(String method,
                                HttpServletRequest request,
                                HttpServletResponse response)
        throws javax.servlet.ServletException, IOException {

        String action = request.getParameter("action");

        if(method.equals("GET")){
            if(action.equals("index")){

            }
            if(action.equals("login")){

            }
        }

        if(method.equals("POST")){


        }
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        //TODO
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        //TODO
    }
}
