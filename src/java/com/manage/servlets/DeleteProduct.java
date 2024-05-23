package com.manage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.manage.product.ProductDAO;

public class DeleteProduct extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int productId = Integer.parseInt(request.getParameter("productId"));
        
        boolean success = ProductDAO.deleteProduct(productId);
        
        if (success) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }   
            
    }
}
