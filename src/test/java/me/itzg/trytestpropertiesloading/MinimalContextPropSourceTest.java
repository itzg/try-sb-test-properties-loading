package me.itzg.trytestpropertiesloading;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {
    UsesAppPropertiesService.class
})
@EnableConfigurationProperties(AppProperties.class)
@TestPropertySource
public class MinimalContextPropSourceTest {

  @Autowired
  Environment env;

  @Autowired
  UsesAppPropertiesService service;

  @Test
  public void propertiesLoads() {
    assertThat(env.getProperty("app.identifier"), equalTo("minimal"));
    assertThat(service.getIdentifier(), equalTo("minimal"));
  }

}
