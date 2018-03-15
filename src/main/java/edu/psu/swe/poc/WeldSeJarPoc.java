package edu.psu.swe.poc;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import lombok.extern.slf4j.Slf4j;

@Dependent
@Slf4j
public class WeldSeJarPoc {

  @Inject
  @ConfigProperty(name = "some.string")
  String someString;

  @Inject
  @ConfigProperty(name = "another.string")
  String anotherString;

  @Inject
  @ConfigProperty(name = "a.third.string")
  String aThirdString;

  public void start() {
    log.trace("start()");
    log.debug("Configuration:");
    log.debug("  someString: {}", someString);
    log.debug("  anotherString: {}", anotherString);
    log.debug("  aThirdString: {}", aThirdString);
  }

}
