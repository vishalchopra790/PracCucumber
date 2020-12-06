package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

@RunWith(Cucumber.class)
public class User {

    @Given("user is on regiesteration page")
    public void user_is_on_regiesteration_page() {

    }


    @Then("user  regiestered sucessfully")
    public void usreRegiesteredSucessfully() {
        System.out.println("hello");
    }


    @When("user enter the follow details")
    public void userEnterTheFollowDetails(List<Map<String, String>> table) {
        System.out.println(table.get(0).get("name")); //vishal
        System.out.println(table.get(1).get("name")); //sagil

        for(Map<String, String> e:table){
            System.out.println(e.get("name"));
        }
    }
}

