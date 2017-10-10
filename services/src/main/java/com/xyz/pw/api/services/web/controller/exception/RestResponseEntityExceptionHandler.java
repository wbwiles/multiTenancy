package com.xyz.pw.api.services.web.controller.exception;

import com.xyz.pw.api.aux.error.ServiceException;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



/**
 * The Class RestResponseEntityExceptionHandler.
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
  @Override
  protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {

    final List<String> errors = new ArrayList<>();
    for (final FieldError error : exception.getBindingResult().getFieldErrors()) {
      errors.add(error.getField() + ": " + error.getDefaultMessage());
    }
    for (final ObjectError error : exception.getBindingResult().getGlobalErrors()) {
      errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
    }
    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), errors);
    return handleExceptionInternal(exception, apiError, headers, apiError.getStatus(), request);
  }

  @Override
  protected ResponseEntity<Object> handleBindException(final BindException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {

    //
    final List<String> errors = new ArrayList<>();
    for (final FieldError error : exception.getBindingResult().getFieldErrors()) {
      errors.add(error.getField() + ": " + error.getDefaultMessage());
    }
    for (final ObjectError error : exception.getBindingResult().getGlobalErrors()) {
      errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
    }
    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), errors);
    return handleExceptionInternal(exception, apiError, headers, apiError.getStatus(), request);
  }


  @Override
  protected ResponseEntity<Object> handleTypeMismatch(final TypeMismatchException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {

    final String error = exception.getValue() + " value for " + exception.getPropertyName() + " should be of type " + exception.getRequiredType();
    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), error);
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  @Override
  protected ResponseEntity<Object> handleMissingServletRequestPart(final MissingServletRequestPartException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
    final String error = exception.getRequestPartName() + " part is missing";
    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), error);
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }


  @Override
  protected ResponseEntity<Object> handleMissingServletRequestParameter(final MissingServletRequestParameterException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
    final String error = exception.getParameterName() + " parameter is missing";
    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), error);
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  /**
   * Handle method argument type mismatch.
   *
   * @param ex the ex
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler({MethodArgumentTypeMismatchException.class})
  public ResponseEntity<Object> handleMethodArgumentTypeMismatch(final MethodArgumentTypeMismatchException exception, final WebRequest request) {
    final String error = exception.getName() + " should be of type " + exception.getRequiredType().getName();
    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), error);
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  /**
   * Handle constraint violation.
   *
   * @param ex the ex
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler({ConstraintViolationException.class})
  public ResponseEntity<Object> handleConstraintViolation(final ConstraintViolationException exception, final WebRequest request) {
    final List<String> errors = new ArrayList<>();
    for (final ConstraintViolation<?> violation : exception.getConstraintViolations()) {
      errors.add(violation.getRootBeanClass().getName() + " " + violation.getPropertyPath() + ": " + violation.getMessage());
    }

    final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, exception.getLocalizedMessage(), errors);
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  // 404

  @Override
  protected ResponseEntity<Object> handleNoHandlerFoundException(final NoHandlerFoundException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
    final String error = "No handler found for " + exception.getHttpMethod() + " " + exception.getRequestURL();
    final ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, exception.getLocalizedMessage(), error);
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }



  // 405

  @Override
  protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(final HttpRequestMethodNotSupportedException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
    final StringBuilder builder = new StringBuilder();
    builder.append(exception.getMethod());
    builder.append(" method is not supported for this request. Supported methods are ");
    exception.getSupportedHttpMethods().forEach(t -> builder.append(t + " "));

    final ApiError apiError = new ApiError(HttpStatus.METHOD_NOT_ALLOWED, exception.getLocalizedMessage(), builder.toString());
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  // 415


  @Override
  protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(final HttpMediaTypeNotSupportedException exception, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
    final StringBuilder builder = new StringBuilder();
    builder.append(exception.getContentType());
    builder.append(" media type is not supported. Supported media types are ");
    exception.getSupportedMediaTypes().forEach(t -> builder.append(t + " "));

    final ApiError apiError = new ApiError(HttpStatus.UNSUPPORTED_MEDIA_TYPE, exception.getLocalizedMessage(), builder.substring(0, builder.length() - 2));
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  // 500

  /**
   * Handle all.
   *
   * @param ex the ex
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler({Exception.class})
  public ResponseEntity<Object> handleAll(final Exception exception, final WebRequest request) {
    logger.error("error", exception);
    final ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, exception.getLocalizedMessage(), "error occurred");
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

  @ExceptionHandler({ServiceException.class})
  protected ResponseEntity<Object> handleAuthorizationException(final ServiceException exception, final WebRequest request) {
    return createServiceExceptionResponse(exception);
  }

  private ResponseEntity<Object> createServiceExceptionResponse(ServiceException exception) {
    ApiError apiError = new ApiError(exception.getErrorType().getHttpStatus(), exception.getMessage(), exception.getAdditionalDescription());
    return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
  }

}

