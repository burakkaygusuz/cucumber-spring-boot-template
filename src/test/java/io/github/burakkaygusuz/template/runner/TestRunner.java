package io.github.burakkaygusuz.template.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features", glue = {"io.github.burakkaygusuz.template.steps",
    "io.github.burakkaygusuz.template.config"}, plugin = {"pretty", "html:target/cucumber-reports.html",
        "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class TestRunner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }
}
