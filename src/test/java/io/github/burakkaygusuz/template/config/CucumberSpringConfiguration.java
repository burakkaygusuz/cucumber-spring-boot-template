package io.github.burakkaygusuz.template.config;

import io.cucumber.spring.CucumberContextConfiguration;
import io.github.burakkaygusuz.template.CucumberSpringBootTemplateApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
    classes = CucumberSpringBootTemplateApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CucumberSpringConfiguration {}
