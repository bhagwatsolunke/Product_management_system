<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="template.jsp" %>
<jsp:useBean id="content" class="java.lang.String" scope="request" />
<c:set var="content" value="addProduct.jsp" />

<div class="container h-100">
    <div class="row h-100 justify-content-center align-items-center">
        <div class="col-md-6">
            <div class="card">
                <h5 class="card-header">Add Product</h5>
                <div class="card-body">
                    <form action="AddProduct" method="POST">
                        <!-- Product Name -->
                        <div class="mb-3">
                            <label for="productName" class="form-label">Product Name</label>
                            <input type="text" class="form-control" id="productName" name="productName" required>
                        </div>

                        <!-- Product Type -->
                        <div class="mb-3">
                            <label for="productType" class="form-label">Product Type</label>
                            <input type="text" class="form-control" id="productType" name="productType" required>
                        </div>

                        <!-- Product Brand -->
                        <div class="mb-3">
                            <label for="productBrand" class="form-label">Product Brand</label>
                            <input type="text" class="form-control" id="productBrand" name="productBrand" required>
                        </div>

                        <!-- Product Place -->
                        <div class="mb-3">
                            <label for="productPlace" class="form-label">Product Place</label>
                            <input type="text" class="form-control" id="productPlace" name="productPlace" required>
                        </div>

                        <!-- Product Warranty -->
                        <div class="mb-3">
                            <label for="productWarranty" class="form-label">Product Warranty (Months)</label>
                            <input type="number" class="form-control" id="productWarranty" name="productWarranty" required>
                        </div>

                        <!-- Product Price -->
                        <div class="mb-3">
                            <label for="productPrice" class="form-label">Product Price</label>
                            <input type="number" class="form-control" id="productPrice" name="productPrice" step="0.01" required>
                        </div>

                        <!-- Submit Button -->
                        <button type="submit" class="btn btn-primary">Add Product</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
