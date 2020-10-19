package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "br.com.rsinet.hub_bdd.provaBDD.stepDefinition", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter: target/cucumber-reports/report.html" })

public class TestRunner {

}