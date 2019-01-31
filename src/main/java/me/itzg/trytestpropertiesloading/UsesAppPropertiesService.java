package me.itzg.trytestpropertiesloading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsesAppPropertiesService {

  private final AppProperties properties;

  @Autowired
  public UsesAppPropertiesService(AppProperties properties) {
    this.properties = properties;
  }

  public String getIdentifier() {
    return properties.getIdentifier();
  }
}
