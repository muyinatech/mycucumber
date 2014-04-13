/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package muyinatech.mycucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = "json:target/cucumber-report.json", dotcucumber = ".cucumber")
public class RunCukesTest {
    
}
