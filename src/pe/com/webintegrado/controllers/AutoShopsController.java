package pe.com.webintegrado.controllers;

import pe.com.webintegrado.models.AutoShop;
import pe.com.webintegrado.models.HrService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AutoShopsController extends javax.servlet.http.HttpServlet {
    HrService service;
    String url;

    public AutoShopsController() {
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
            if(action.equals("showAll")){
//                List<AutoShop> autoShops = service.findAllAutoShops();
//                request.setAttribute("autoShops", autoShops);
//                url = "";
            }
        }

        if(method.equals("POST")){


        }
    }
}
