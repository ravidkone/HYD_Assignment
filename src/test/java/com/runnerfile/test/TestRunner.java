package com.runnerfile.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFilesTest/flightbooking.feature",
				glue= {"com.stepDefinition.flightTravel"},
				dryRun = false,
				monochrome = true,
				strict = true,
				plugin = {"pretty","html:test_output"}
				)
public class TestRunner {

}