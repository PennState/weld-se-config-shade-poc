package edu.psu.swe.poc;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@Slf4j
public class Main {

  @Inject
  WeldSeJarPoc business;
  
  public void start(@Observes ContainerInitialized event) {
    log.trace("start(@Observes ContainerInitialized event)");
    business.start();
  }

}
