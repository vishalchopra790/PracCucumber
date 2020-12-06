package MyHooks;

import io.cucumber.java.*;

public class AmazonHook {

    @Before("@Regression")
    public void setup(Scenario sc){
        System.out.println("Driver setup  "+sc.getName());
    }

//    @After
//    public void teardown(){
//        System.out.println("Driver closed ");
//    }
//
//    @BeforeStep
//    public void befStep(){
//        System.out.println("Before Step");
//    }
//
//    @AfterStep
//    public void aftStep(){
//        System.out.println("After Step");
//    }
}
