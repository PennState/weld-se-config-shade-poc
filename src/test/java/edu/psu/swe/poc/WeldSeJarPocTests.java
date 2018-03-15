/**
 * 
 */
package edu.psu.swe.poc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author smoyer1
 *
 */
@EnableWeld
class WeldSeJarPocTests {
  
  static final String MESSAGE_ONE = "has a value";
  static final String MESSAGE_TWO = "also has a value";
  static final String MESSAGE_THREE = "and so does this one";
  
  @WeldSetup
  WeldInitiator container = WeldInitiator.performDefaultDiscovery();

  @BeforeAll
  static void beforeAll() {
    System.setProperty("some.string", MESSAGE_ONE);
    System.setProperty("another.string", MESSAGE_TWO);
    System.setProperty("a.third.string", MESSAGE_THREE);
  }
  
  @Inject
  WeldSeJarPoc cot;
  
  /**
   * Test method for {@link edu.psu.swe.poc.WeldSeJarPoc#start(org.jboss.weld.environment.se.events.ContainerInitialized)}.
   */
  @Test
    void testStart(WeldSeJarPoc cot) {
    assertNotNull(cot);
    assertEquals(MESSAGE_ONE, cot.someString);
    assertEquals(MESSAGE_TWO, cot.anotherString);
    assertEquals(MESSAGE_THREE, cot.aThirdString);
  }

}
