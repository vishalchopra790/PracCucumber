package AmazonImplement;

public class Search {

    public Object displayProduct(Product product){
        if(product.getProductList().contains(product.getProductName())){
            return product.getProductName();
                    }
        return null;
    }
}
