<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="template.jsp" %>
<jsp:useBean id="content" class="java.lang.String" scope="request" />
<c:set var="content" value="updateProduct.jsp" />

 <div class="container mt-5">
        <h2>Update Product</h2>
        <form action="UpdateProduct" method="post">
            <div class="form-group">
                <label for="productId">Product ID:</label>
                <input type="text" class="form-control" id="productId" name="productId" required>
            </div>
            <div class="form-group">
                <label for="newName">New Name:</label>
                <input type="text" class="form-control" id="newName" name="newName" required>
            </div>
            <div class="form-group">
                <label for="newType">New Type:</label>
                <input type="text" class="form-control" id="newType" name="newType" required>
            </div>
            <div class="form-group">
                <label for="newBrand">New Brand:</label>
                <input type="text" class="form-control" id="newBrand" name="newBrand" required>
            </div>
            <div class="form-group">
                <label for="newPlace">New Place:</label>
                <input type="text" class="form-control" id="newPlace" name="newPlace" required>
            </div>
            <div class="form-group">
                <label for="newWarranty">New Warranty:</label>
                <input type="number" class="form-control" id="newWarranty" name="newWarranty" required>
            </div>
            <div class="form-group">
                <label for="newPrice">New Price:</label>
                <input type="number" step="0.01" class="form-control" id="newPrice" name="newPrice" required>
            </div>
            <button type="submit" class="btn btn-primary">Update Product</button>
        </form>
    </div>