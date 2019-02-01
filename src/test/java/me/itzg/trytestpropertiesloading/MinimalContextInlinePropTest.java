package me.itzg.trytestpropertiesloading;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.TestPropertySourceUtils;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
    UsesAppPropertiesService.class
})
@EnableConfigurationProperties(AppProperties.class)
@TestPropertySource(properties = "app.identifier=inline")
public class MinimalContextInlinePropTest {

  @Autowired
  Environment env;

  @Autowired
  UsesAppPropertiesService service;

  @Test
  public void propertiesLoads() {
    assertThat(env.getProperty("app.identifier"), equalTo("inline"));
    assertThat(service.getIdentifier(), equalTo("inline"));
  }

}
