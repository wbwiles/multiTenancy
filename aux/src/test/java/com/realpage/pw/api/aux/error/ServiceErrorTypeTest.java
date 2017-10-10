package com.xyz.pw.api.aux.error;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.HttpStatus;

public class ServiceErrorTypeTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @Before
  public void setUp() throws Exception {}

  @Test
  public void testGetHttpStatus() {
    assertSame(HttpStatus.INTERNAL_SERVER_ERROR, ServiceErrorType.APPLICATION_ERROR.getHttpStatus());
  }

  @Test
  public void testGetByName() {
    assertSame(ServiceErrorType.APPLICATION_ERROR_TIMEOUT, ServiceErrorType.getByName("APPLICATION_ERROR_TIMEOUT"));
  }

  @Test(expected = RuntimeException.class)
  public void testGetByNameFail() {
    ServiceErrorType.getByName("TEST");
  }

  @Test
  public void testGetByErrorCode() {
    assertSame(ServiceErrorType.AUTHENTICATION_FAILED_ERROR, ServiceErrorType.getByErrorCode("6500"));
  }

  @Test(expected = RuntimeException.class)
  public void testGetByErrorCodeFail() {
    ServiceErrorType.getByErrorCode("0000");
  }

  @Test
  public void testToString() {
    String result = ServiceErrorType.AUTHENTICATION_FAILED_ERROR.toString();
    assertTrue(result.contains("code=6500"));
    assertTrue(result.contains("description=Unable to verify your credentials."));
    assertTrue(result.contains("httpStatus=401"));
    assertTrue(result.contains("name=AUTHENTICATION_FAILED_ERROR"));
  }
}
