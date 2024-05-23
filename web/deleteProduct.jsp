<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="template.jsp" %>
<jsp:useBean id="content" class="java.lang.String" scope="request" />
<c:set var="content" value="deleteProduct.jsp" />


<div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <!-- Delete Product Form -->
                <div class="card">
                    <h5 class="card-header">Delete Product</h5>
                    <div class="card-body">
                        <form action="DeleteProduct" method="GET">
                            <div class="mb-3">
                                <label for="productId" class="form-label">Product ID</label>
                                <input type="text" class="form-control" id="productId" name="productId" required>
                            </div>
                            <button type="submit" class="btn btn-danger">Delete</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
