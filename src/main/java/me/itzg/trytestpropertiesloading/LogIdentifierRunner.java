package me.itzg.trytestpropertiesloading;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LogIdentifierRunner implements ApplicationRunner {

  private final UsesAppPropertiesService service;

  @Autowired
  public LogIdentifierRunner(UsesAppPropertiesService service) {
    this.service = service;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    log.info("Application loaded this identifer: {}", service.getIdentifier());
  }
}
