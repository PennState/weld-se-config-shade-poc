package edu.psu.swe.poc;

import java.util.stream.Stream;

import org.jboss.weld.environment.se.ExceptionHandler;
import org.jboss.weld.exceptions.DeploymentException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeploymentExceptionHandler implements ExceptionHandler {

	@Override
	public void handle(Throwable t) {
        log.error(t.getMessage());
        System.exit(2);
	}

	@Override
	public boolean supports(Throwable throwable) {
		return DeploymentException.class.equals(throwable.getClass());
	}
}