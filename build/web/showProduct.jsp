<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="template.jsp" %>
<jsp:useBean id="content" class="java.lang.String" scope="request" />
<c:set var="content" value="showProduct.jsp" />

<div class ="container">
 <form method="post" action="">
            <div class="mb-3">
                <label for="productId" class="form-label">Enter Product ID:</label>
                <input type="text" class="form-control" id="productId" name="productId" required>
            </div>
            <button type="submit" class="btn btn-primary">Show Product</button>
 </form>
    
 
        <% String productIdStr = request.getParameter("productId"); %>
        <% if (productIdStr != null && productIdStr.matches("\\d+")) { %>
         
            <% int productId = Integer.parseInt(productIdStr); %>

         
            <% com.manage.product.Product product = com.manage.product.ProductDAO.aSingleProduct(productId); %>
           
            <% if (product != null) { %>
                <h2>Product Details</h2>
                <p><strong>Product ID:</strong> <%= product.getProductId() %></p>
                <p><strong>Product Name:</strong> <%= product.getProductName() %></p>
                <p><strong>Product Type:</strong> <%= product.getProductType() %></p>
                <p><strong>Product Brand:</strong> <%= product.getProductBrand() %></p>
                <p><strong>Product Place:</strong> <%= product.getProductPlace() %></p>
                <p><strong>Product Warranty:</strong> <%= product.getProductWarranty() %> months</p>
                <p><strong>Product Price:</strong> $<%= product.getProductPrice() %></p>
            <% } else { %>
                <p>Product not found.</p>
            <% } %>
        <% } %>
    
</div>







