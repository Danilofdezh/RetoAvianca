package com.avianca.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoAvianca.feature",
glue = "com.avianca.tests.stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags = "@regression")
public class RetoAviancaRunners {
}
