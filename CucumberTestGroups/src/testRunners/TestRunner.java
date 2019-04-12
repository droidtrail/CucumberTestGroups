package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features   =  "resources/features",
				 glue       = {"stepDefinitions"},
				 monochrome = true,
				 snippets   = SnippetType.CAMELCASE,
				 dryRun     = false,
				 strict     = false,
				 tags       = {"@FunctionalTest","~@RegressionTest","~@SmokeTest","~@End2End"} 
				)

public class TestRunner {

}
