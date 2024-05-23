package com.manage.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.manage.product.Product;
import com.manage.product.ProductDAO;

public class AddProduct extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Parse the parameters to the correct data types
        String name = request.getParameter("productName");
        String type = request.getParameter("productType");
        String brand = request.getParameter("productBrand");
        String place = request.getParameter("productPlace");
        int warranty = Integer.parseInt(request.getParameter("productWarranty"));
        double price = Double.parseDouble(request.getParameter("productPrice"));

        Product product = new Product(name, type, brand, place, price, warranty);
        boolean success = ProductDAO.insertProductToDB(product);

        if (success) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
