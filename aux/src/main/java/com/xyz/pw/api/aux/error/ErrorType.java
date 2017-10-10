package com.xyz.pw.api.aux.error;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

/**
 * The Interface ErrorType.
 */
public interface ErrorType extends Serializable {

  /**
   * Provides a short code to uniquely identify a particular error.
   * 
   * @return the error code.
   */
  String getCode();

  /**
   * Provides a description for the error.
   * 
   * @return the description.
   */
  String getDescription();

  /**
   * Gets the http status.
   *
   * @return the http status
   */
  HttpStatus getHttpStatus();

  /**
   * getParamaterizedDescription.
   * 
   * @param values values
   * @return formatted description
   */
  String getParamaterizedDescription(String[] values);

}
