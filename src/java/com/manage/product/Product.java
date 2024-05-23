package com.manage.product;

public class Product {

    private int ProductId;
    private String ProductName;
    private String ProductType;
    private String ProductPlace;
    private String ProductBrand;
    private double ProductPrice;
    private int ProductWarranty;

    public Product(int id, String productName, String productType, String productPlace, String productBrand,
            double productPrice, int productWarranty) {
        super();
        ProductId = id;
        ProductName = productName;
        ProductType = productType;
        ProductPlace = productPlace;
        ProductBrand = productBrand;
        ProductPrice = productPrice;
        ProductWarranty = productWarranty;
    }

    public Product(String ProductName, String ProductType, String ProductPlace, String ProductBrand, double ProductPrice, int ProductWarranty) {
        super();
        this.ProductName = ProductName;
        this.ProductType = ProductType;
        this.ProductPlace = ProductPlace;
        this.ProductBrand = ProductBrand;
        this.ProductPrice = ProductPrice;
        this.ProductWarranty = ProductWarranty;
    }
    
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        ProductType = productType;
    }

    public String getProductPlace() {
        return ProductPlace;
    }

    public void setProductPlace(String productPlace) {
        ProductPlace = productPlace;
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setProductBrand(String productBrand) {
        ProductBrand = productBrand;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public int getProductWarranty() {
        return ProductWarranty;
    }

    public void setProductWarranty(int productWarranty) {
        ProductWarranty = productWarranty;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        this.ProductId = productId;
    }

    @Override
		public String toString() {
			return "Product [ProductId=" + ProductId +",ProductName=" + ProductName + ", ProductType=" + ProductType + ", ProductPlace="
					+ ProductPlace + ", ProductBrand=" + ProductBrand + ", ProductPrice=" + ProductPrice
					+ ", ProductWarranty=" + ProductWarranty + "]";
		}    

}
