package me.itzg.trytestpropertiesloading;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("app")
@Component
@Data
public class AppProperties {

  /**
   * The identifier our application wants.
   */
  String identifier = "default";
}
