package me.itzg.trytestpropertiesloading;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
    properties = "app.identifier=inline"
)
public class FullContextInlinePropTest {

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

