package edu.psu.swe.poc;

import javax.enterprise.event.Observes;

import org.jboss.weld.environment.se.events.ContainerInitialized;

public class WeldSeJarPocMain {
  
  public void start(@Observes ContainerInitialized event) {
    System.out.println("Got here!");
  }

}
