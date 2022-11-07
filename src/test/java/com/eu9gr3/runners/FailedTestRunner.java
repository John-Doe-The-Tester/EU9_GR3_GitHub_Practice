package com.eu9gr3.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"html:target/failed-html-report"},
		features = "@target/rerun.txt",
		glue = "com/eu9gr3/step_definitions"
)

public class FailedTestRunner {
}
