package com.xyz.pw.api.services.web.controller.exception;



import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.http.HttpStatus;

public class ApiError {

  private HttpStatus status;
  private String message;
  private List<String> errors;

  public ApiError() {
    super();
  }

  /**
   * Instantiates a new api error.
   *
   * @param status the status
   * @param message the message
   * @param errors the errors
   */
  public ApiError(final HttpStatus status, final String message, final List<String> errors) {
    super();
    this.status = status;
    this.message = message;
    this.errors = errors;
  }

  /**
   * Instantiates a new api error.
   *
   * @param status the status
   * @param message the message
   * @param error the error
   */
  public ApiError(final HttpStatus status, final String message, final String error) {
    super();
    this.status = status;
    this.message = message;
    errors = Arrays.asList(error);
  }


  public HttpStatus getStatus() {
    return status;
  }

  public void setStatus(final HttpStatus status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(final List<String> errors) {
    this.errors = errors;
  }

  public void setError(final String error) {
    errors = Arrays.asList(error);
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    return EqualsBuilder.reflectionEquals(this, obj);
  }

}
