package com.manage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.manage.product.ProductDAO;

public class UpdateProduct extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        int productId = Integer.parseInt(request.getParameter("productId"));
        String newName = request.getParameter("newName");
        String newType = request.getParameter("newType");
        String newBrand = request.getParameter("newBrand");
        String newPlace = request.getParameter("newPlace");
        int newWarranty = Integer.parseInt(request.getParameter("newWarranty"));
        double newPrice = Double.parseDouble(request.getParameter("newPrice"));
        
        if (ProductDAO.inProductExists(productId)) {
            boolean success = ProductDAO.updateProduct(productId, newName, newType, newBrand, newPlace, (int) newPrice, newWarranty);
                    
            if (success) {
                response.sendRedirect("success.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        } else {
            response.sendRedirect("productNotFound.jsp");
        }
    }
}
