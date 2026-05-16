package fr.craft.kata.cucumber;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

@Suite(failIfNoTests = false)
@IncludeEngines("cucumber")
@SelectDirectories("src/test/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "fr.craft.kata")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class CucumberTest {}
