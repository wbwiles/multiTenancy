package com.xyz.pw.api.services.web.controller.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.xyz.pw.api.aux.error.ServiceErrorType;
import com.xyz.pw.api.aux.error.ServiceException;
import com.xyz.pw.api.services.web.controller.exception.ApiError;
import com.xyz.pw.api.services.web.controller.exception.RestResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;

public class RestResponseEntityExceptionHandlerTest {

  private RestResponseEntityExceptionHandler restResponseEntityExceptionHandler;
  private HttpStatus status;
  @Mock
  private WebRequest mockRequest;
  @Mock
  private HttpHeaders mockHeaders;
  @Mock
  private MethodArgumentNotValidException mockEx;
  @Mock
  private BindingResult mockBind;
  private List<FieldError> fieldErrors;
  private FieldError fieldError = new FieldError("ObjectNameGoesHere", "SomeFieldName", "defaultMessage");
  private List<ObjectError> globalErrors = new ArrayList<ObjectError>();
  private ObjectError objectError;

  /**
   * Inits the.
   */
  @Before
  public void init() {
    status = HttpStatus.BAD_REQUEST;
    restResponseEntityExceptionHandler = new RestResponseEntityExceptionHandler();
    fieldErrors = new ArrayList<FieldError>();
    fieldErrors.add(fieldError);
    objectError = new ObjectError("ObjectErrorName", "globalDefaultMessage");
    globalErrors.add(objectError);
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testHandleMethodArgumentNotValidMethodArgumentNotValidExceptionHttpHeadersHttpStatusWebRequest() {
    Mockito.when(mockEx.getBindingResult()).thenReturn(mockBind);
    Mockito.when(mockBind.getFieldErrors()).thenReturn(fieldErrors);
    Mockito.when(mockBind.getGlobalErrors()).thenReturn(globalErrors);

    ResponseEntity<Object> result = restResponseEntityExceptionHandler.handleMethodArgumentNotValid(mockEx, mockHeaders, status, mockRequest);
    assertNotNull(result);
    assertEquals(HttpStatus.BAD_REQUEST, result.getStatusCode());
    assertEquals(HttpStatus.BAD_REQUEST, ((ApiError) result.getBody()).getStatus());
    assertEquals("SomeFieldName: defaultMessage", ((ApiError) result.getBody()).getErrors().get(0));
    assertEquals("ObjectErrorName: globalDefaultMessage", ((ApiError) result.getBody()).getErrors().get(1));
  }


  @Test
  public void testHandleAuthorizationException() {
    Mockito.when(mockEx.getBindingResult()).thenReturn(mockBind);
    Mockito.when(mockBind.getFieldErrors()).thenReturn(fieldErrors);
    Mockito.when(mockBind.getGlobalErrors()).thenReturn(globalErrors);
    ServiceException serviceException = new ServiceException(ServiceErrorType.AUTHENTICATION_FAILED_ERROR, "test");
    ResponseEntity<Object> result = restResponseEntityExceptionHandler.handleAuthorizationException(serviceException, mockRequest);
    assertNotNull(result);
    assertEquals(HttpStatus.UNAUTHORIZED, result.getStatusCode());
    assertEquals(HttpStatus.UNAUTHORIZED, ((ApiError) result.getBody()).getStatus());
    assertEquals("test", ((ApiError) result.getBody()).getErrors().get(0));
  }

}
