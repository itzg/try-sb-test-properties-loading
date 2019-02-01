package me.itzg.trytestpropertiesloading;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
    UsesAppPropertiesService.class
}, initializers = {
    ConfigFileApplicationContextInitializer.class
})
@EnableConfigurationProperties(AppProperties.class)
public class MinimalContextMainYmlTest {

  @Autowired
  Environment env;

  @Autowired
  UsesAppPropertiesService service;

  @Test
  public void propertiesLoads() {
    assertThat(env.getProperty("app.identifier"), equalTo("main-file"));
    assertThat(service.getIdentifier(), equalTo("main-file"));
  }

}
