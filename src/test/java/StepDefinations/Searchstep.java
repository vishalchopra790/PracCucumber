package StepDefinations;

import AmazonImplement.Product;
import AmazonImplement.Search;
import io.cucumber.java.en.*;
import io.cucumber.messages.Messages;
import org.junit.Assert;

public class Searchstep {
   Product product;
   Search search;

    @Given("I  have  a search field on search page")
    public void i_have_a_search_field_on_search_page() {
        System.out.println("We landed on HomePage");
    }

    @When("I search for a product with a name {string} and price {int}")
    public void i_search_for_a_product_with_a_name_and_price(String productName, Integer price) {
        System.out.println("The name of product "+productName+" and "+price);
        product=new Product(productName,price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String productName) {
        search=new Search();
        String name= (String) search.displayProduct(product);
        Assert.assertEquals(productName,name);
    }


}
