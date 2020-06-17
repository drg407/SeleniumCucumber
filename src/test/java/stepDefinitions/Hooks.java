package stepDefinitions;

import io.cucumber.java.After;
import resources.Base;

public class Hooks extends Base {

    @After()
    public void driverTeardown() {
        driver.close();
    }

}