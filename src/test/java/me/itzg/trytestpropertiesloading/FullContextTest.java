package me.itzg.trytestpropertiesloading;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FullContextTest {

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

