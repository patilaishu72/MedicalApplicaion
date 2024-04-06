package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;



@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features= "Features", glue="stepDefination", tags="@Feature1"
		
		)




public class Run {

}
