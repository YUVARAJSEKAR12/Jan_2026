package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Develop\\new\\new\\oct\\HirenOne\\Cucumber_Dec\\src\\test\\java\\feature",
glue = "com.app.stepdefinition",
tags = "@runAll",
dryRun = false,
publish = true,
monochrome = true)
public class Runner {

}
