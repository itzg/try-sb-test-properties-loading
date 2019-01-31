package me.itzg.trytestpropertiesloading;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TryTestPropertiesLoadingApplicationTests {

  @Autowired
  UsesAppPropertiesService service;

  @Test
  public void contextLoads() {
    assertThat(service.getIdentifier(), equalTo("hello"));
  }

}

