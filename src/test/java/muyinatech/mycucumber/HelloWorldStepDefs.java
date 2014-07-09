package muyinatech.mycucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloWorldStepdefs {

    @Given("^I have a (.+) project$")
    public void i_have_a_project(String name) throws Throwable {
        System.out.println("Yes, I am at my " + name + " project");
    }

    @When("^I write a Hello World Cucumber test$")
    public void i_write_a_Hello_World_Cucumber_test() throws Throwable {
        System.out.println("Yeah! I just write my test");
    }

    @Then("^I should be able to run it and see \"(.*?)\" printed on screen$")
    public void i_should_be_able_to_run_it_and_see_printed_on_screen(String arg) throws Throwable {
        System.out.println(arg);
    }

    @Given("I have (\\d+) cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        System.out.println("You have " + cukes + "cukes.");
    }

    @Given("^the following users exist:$")
    public void the_following_users_exist(DataTable entries) {
        System.out.println(entries.getGherkinRows());
    }
}
