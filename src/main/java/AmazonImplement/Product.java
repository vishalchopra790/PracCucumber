package AmazonImplement;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private Integer price;

    public Product(String productName, Integer price) {
        this.productName = productName;
        this.price= price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getProductList(){
        List<String> product=new ArrayList<>();
        product.add("Apple Iphone 11");
        product.add("Sony");
        product.add("nokia");
        return  product;
    }
}
