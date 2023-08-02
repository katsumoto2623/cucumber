package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*
    pre- and post-conditions for scenario and steps
 */
public class Hooks {

    //import from io.cucumber not junit
    @Before
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before");
    }

    @After
    public void tearDownScenario(){
        System.out.println("Closing  browser using cucumber @After");
    }
}
