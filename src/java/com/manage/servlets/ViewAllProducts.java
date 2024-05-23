
package com.manage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.manage.product.Product;
import com.manage.product.ProductDAO;
import java.util.List;


public class ViewAllProducts extends HttpServlet{
    
    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
        
        List<Product>productList = ProductDAO.getAllProducts();
        
        request.setAttribute("productList", productList);
        
        request.getRequestDispatcher("showInventry.jsp").forward(request,response);
        
    }
    
}


