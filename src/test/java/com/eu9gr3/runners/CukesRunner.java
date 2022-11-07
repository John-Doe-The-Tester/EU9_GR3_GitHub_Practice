package com.eu9gr3.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				//"pretty",
				"html:target/cucumber-report.html",
				"json:target/cucumber.json",
				"me.jvt.cucumber.report.PrettyReports:target/cucumber",
				"rerun:target/rerun.txt",
		},
		features = "src/test/resources/features",
		glue = "com/eu9gr3/step_definitions",
		dryRun = false,
		tags = "@wip",
		publish = false
)

public class CukesRunner {

}


