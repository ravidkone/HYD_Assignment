package com.runnerfile.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "FeaturesFilesTest",
				glue= {"com.stepDefinition.flightTravel"},
				dryRun = false,
				strict = true,
				plugin = {"pretty","html:test_output"}
				)

public class TestRunner{

}