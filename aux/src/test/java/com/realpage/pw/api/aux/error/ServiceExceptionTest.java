package com.xyz.pw.api.aux.error;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * The Class ServiceExceptionTest.
 */
public class ServiceExceptionTest {

  /**
   * Test constructor only error.
   */
  @Test
  public void testConstructorOnlyError() {
    ServiceException serviceException = new ServiceException(ServiceErrorType.APPLICATION_ERROR);
    assertEquals(ServiceErrorType.APPLICATION_ERROR.getDescription(), serviceException.getErrorType().getDescription());
    assertEquals(ServiceErrorType.APPLICATION_ERROR.getCode(), serviceException.getErrorType().getCode());
  }

  /**
   * Test constructor with parameterized values error.
   */
  @Test
  public void testConstructorWithParameterizedValuesError() {
    ServiceException serviceException = new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_GENERAL_ERROR, new String[] {"abc123#14*", "Invalid encryption"});
    assertEquals("The credentials could not be verified. abc123#14* Please verify you credentials and try again. Invalid encryption", serviceException.getDescription());
    assertEquals(ServiceErrorType.AUTHORIZATION_FAILED_GENERAL_ERROR.getCode(), serviceException.getErrorType().getCode());
  }

  /**
   * Test constructor with no parameterized values error.
   */
  @Test
  public void testConstructorWithNoParameterizedValuesError() {
    ServiceException serviceException = new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_ERROR);
    assertEquals("Your credentials do not allow access to this resource.", serviceException.getDescription());
    assertEquals(ServiceErrorType.AUTHORIZATION_FAILED_ERROR.getCode(), serviceException.getErrorType().getCode());
  }

  /**
   * Test constructor with parameterized values and addtl desc error.
   */
  @Test
  public void testConstructorWithParameterizedValuesAndAddtlDescError() {
    ServiceException serviceException = new ServiceException(ServiceErrorType.APPLICATION_ERROR_TIMEOUT, new String[] {"222", "Couldn't contact the database"}, "Additional Description");
    assertTrue(serviceException.getDescription().contains("Additional Description"));
    assertEquals("Additional Description", serviceException.getAdditionalDescription());
  }

  /**
   * Test constructor with cause error.
   */
  @Test
  public void testConstructorWithCauseError() {
    Throwable throwable = new RuntimeException("Runtime Disaster");
    ServiceException serviceException = new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_ERROR, throwable);
    assertNotNull(serviceException.getCause());
    assertEquals(true, serviceException.isCausePresent());
    assertTrue(serviceException.getDescription().contains("Runtime Disaster"));
  }
}
