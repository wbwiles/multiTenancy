package com.xyz.pw.api.aux.error;

import java.text.MessageFormat;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.http.HttpStatus;


/**
 * The Enum ServiceErrorType.
 */
public enum ServiceErrorType implements ErrorType {

  // Generic starts here - 5000
  APPLICATION_ERROR("5000", HttpStatus.INTERNAL_SERVER_ERROR, "Internal Application Error, Please post to the support team with additional details of your request, so the team can investigate."), //
  APPLICATION_ERROR_BAD_GATEWAY("5002", HttpStatus.INTERNAL_SERVER_ERROR, "The system is down or being upgraded."), //
  APPLICATION_ERROR_UNAVAILABLE("5003", HttpStatus.TOO_MANY_REQUESTS, "The servers are up, but overloaded with requests. Try again later."), //
  APPLICATION_ERROR_TIMEOUT("5004", HttpStatus.REQUEST_TIMEOUT, "The servers are up, but the request couldn’t be serviced. Try again later."), //

  // 2000
  RESOURCE_NOT_FOUND("2000", HttpStatus.NOT_FOUND, "A resource {0} associated with the request could not be resolved."), //


  // 6500 start authentication login issues
  AUTHENTICATION_FAILED_ERROR("6500", HttpStatus.UNAUTHORIZED, "Unable to verify your credentials."), //
  AUTHORIZATION_FAILED_ERROR("6501", HttpStatus.UNAUTHORIZED, "Your credentials do not allow access to this resource."), //
  AUTHORIZATION_FAILED_GENERAL_ERROR("6502", HttpStatus.UNAUTHORIZED, "The credentials could not be verified. {0} Please verify you credentials and try again. {1}"), //
  AUTHORIZATION_FAILED_NO_CREDENTIALS("6503", HttpStatus.UNAUTHORIZED, "You did not provide any credentials.");

  private static MessageFormat formattedMessage = new MessageFormat("");
  private String code;
  private String description;
  private HttpStatus httpStatus;

  private ServiceErrorType(String code, HttpStatus httpStatus, String description) {
    this.code = code;
    this.description = description;
    this.httpStatus = httpStatus;
  }


  /**
   * Gets the code.
   * 
   * @return the code
   */
  @Override
  public String getCode() {
    return code;
  }

  /**
   * Gets the description.
   * 
   * @return the description
   */
  @Override
  public String getDescription() {
    return description;
  }


  /**
   * Gets the http status.
   *
   * @return the http status
   */
  public HttpStatus getHttpStatus() {
    return httpStatus;
  }


  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
  }

  /**
   * get enum by code.
   * 
   * @param name - enum name
   * @return enum instance
   */
  public static ServiceErrorType getByName(final String name) {
    for (ServiceErrorType serviceErrorType : values()) {
      if (serviceErrorType.name().equals(name)) {
        return serviceErrorType;
      }
    }
    throw new ServiceException(ServiceErrorType.APPLICATION_ERROR, "Invalid ServiceErrorType name: " + name);
  }

  /**
   * Find the error associated with the error code.
   * 
   * @param errorCode error code
   * @return Error associated with the error code
   */
  public static ServiceErrorType getByErrorCode(final String errorCode) {
    for (ServiceErrorType serviceErrorType : values()) {
      if (serviceErrorType.getCode().equals(errorCode)) {
        return serviceErrorType;
      }
    }
    throw new ServiceException(ServiceErrorType.APPLICATION_ERROR, "Invalid ServiceErrorType errorCode: " + errorCode);

  }

  /**
   * getParamaterizedDescription.
   * 
   * @param values values
   * @return formatted description
   */
  @Override
  public String getParamaterizedDescription(String[] values) {
    formattedMessage.applyPattern(this.getDescription());
    return formattedMessage.format(values);
  }



}
