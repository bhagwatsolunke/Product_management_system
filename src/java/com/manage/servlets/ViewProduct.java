
package com.manage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.manage.product.Product;
import com.manage.product.ProductDAO;


public class ViewProduct extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int productId = Integer.parseInt(request.getParameter("productid"));
        
        Product product = ProductDAO.aSingleProduct(productId);
        
        request.setAttribute("product", product);

        request.getRequestDispatcher("/WEB-INF/jsp/viewProduct.jsp").forward(request, response);
    }
}
