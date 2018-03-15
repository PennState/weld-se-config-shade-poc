package edu.psu.swe.poc;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterDeploymentValidation;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeploymentValidationExtension implements Extension {

  void afterDeploymentValidation(@Observes AfterDeploymentValidation event, BeanManager beanManager) {
    log.trace("afterDeploymentValidation(@Observes AfterDeploymentValidation event)");
  }

}
