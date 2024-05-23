<%@page import="com.manage.product.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="template.jsp" %>
<jsp:useBean id="content" class="java.lang.String" scope="request" />
<c:set var="content" value="showInventry.jsp" />


<div class="container mt-5">
    <h2>All Products</h2>
    <div class="row">
        <%
            java.util.List<Product> products = (java.util.List<Product>) request.getAttribute("productList");
            for (Product product : products) {
        %>
        <div class="col-md-4">
            <div class="card mb-3">
                <img src="product-image.jpg" class="card-img-top" alt="Product Image">
                <div class="card-body">
                    <h5 class="card-title"><%= product.getProductName()%></h5>
                    <p class="card-text">Type: <%= product.getProductType()%></p>
                    <p class="card-text">Brand: <%= product.getProductBrand()%></p>
                    <p class="card-text">Place: <%= product.getProductPlace()%></p>
                    <p class="card-text">Warranty: <%= product.getProductWarranty()%> months</p>
                    <p class="card-text">Price: $<%= product.getProductPrice()%></p>
                </div>
            </div>
        </div>
        <%
            }
        %>
    </div>
</div>
