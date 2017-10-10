package com.xyz.pw.api.aux.error;

import java.util.Arrays;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The Class ServiceException.
 */
public class ServiceException extends RuntimeException {
  private static final long serialVersionUID = 4502671307026292568L;
  private static final String DELIMETER = " - ";
  private static final String LINE_SEPARATOR = System.getProperty("line.separator");
  private static final String CAUSED_BY = "Caused by: ";

  private final String additionalDescription;
  private final Throwable cause;
  private final ErrorType errorType;
  private final String[] parameterizedValues;

  /**
   * Constructs a ServiceException using the error detail contained in the supplied ErrorType and
   * some extra information that may help diagnose the error and an exception that was caught.
   *
   * @param errorType errorType
   */
  public ServiceException(ErrorType errorType) {
    super(errorType.getDescription());
    this.errorType = errorType;
    additionalDescription = null;
    cause = null;
    parameterizedValues = null;
  }

  /**
   * Constructs a ServiceException using the error detail contained in the supplied ErrorType and
   * some extra information that may help diagnose the error and an exception that was caught.
   *
   * @param errorType errorType
   * @param values parameteries values
   */
  public ServiceException(ErrorType errorType, String[] values) {
    super(errorType.getParamaterizedDescription(values));
    this.errorType = errorType;
    additionalDescription = null;
    cause = null;
    parameterizedValues = Arrays.copyOf(values, values.length);
  }

  /**
   * Constructs a ServiceException using the error detail contained in the supplied ErrorType and
   * some extra information that may help diagnose the error and an exception that was caught.
   *
   * @param errorType errorType
   * @param values parameterizes values
   * @param additionalDescription aAdditionalDescription
   */
  public ServiceException(ErrorType errorType, String[] values, String additionalDescription) {
    super(errorType.getParamaterizedDescription(values));
    this.errorType = errorType;
    this.additionalDescription = additionalDescription;
    cause = null;
    parameterizedValues = Arrays.copyOf(values, values.length);
  }

  /**
   * Constructs a ServiceException using the error detail contained in the supplied ErrorType and
   * some extra information that may help diagnose the error and an exception that was caught.
   *
   * @param errorType errorType
   * @param cause Throwable
   */
  public ServiceException(ErrorType errorType, Throwable cause) {
    super(errorType.getDescription());
    this.errorType = errorType;
    additionalDescription = null;
    this.cause = cause;
    parameterizedValues = null;

  }

  /**
   * Constructs a ServiceException using the error detail contained in the supplied ErrorType and
   * some extra information that may help diagnose the error and an exception that was caught.
   *
   * @param errorType errorType
   * @param additionalDescription additionalDescription
   */
  public ServiceException(ErrorType errorType, String additionalDescription) {
    super(errorType.getDescription());
    this.errorType = errorType;
    this.additionalDescription = additionalDescription;
    cause = null;
    parameterizedValues = null;

  }

  /**
   * Constructs a ServiceException using the error detail contained in the supplied ErrorType and
   * some extra information that may help diagnose the error and an exception that was caught
   * while identifying the error.
   * 
   * @param aErrorType -
   * @param aAdditionalDescription -
   * @param aCause -
   */
  public ServiceException(ErrorType aErrorType, String aAdditionalDescription, Throwable aCause) {
    errorType = aErrorType;
    additionalDescription = aAdditionalDescription;
    cause = aCause;
    parameterizedValues = null;

  }

  /**
   * Any descriptive data associated with the error (except a stack trace) concatenated into
   * a single string. Includes error code, the ErrorType's description and any additional
   * description supplied while constructing the ServiceError
   * 
   * @return description
   */
  public String getDescription() {
    StringBuilder buffer = new StringBuilder();
    if (parameterizedValues != null) {
      buffer.append(errorType.getParamaterizedDescription(parameterizedValues));
    } else {
      buffer.append(errorType.getDescription());
    }
    if ((additionalDescription != null) && (additionalDescription.length() > 0)) {
      buffer.append(DELIMETER);
      buffer.append(additionalDescription);
    }

    if (cause != null) {
      buffer.append(LINE_SEPARATOR + CAUSED_BY + cause.getClass().getName() + DELIMETER + cause.getMessage());
    }

    return buffer.toString();
  }

  /**
   * An ErrorType which either indentifies a class of error (external communication) or a uniquely
   * identifies this particular error (unit price too small).
   * 
   * @return ErrorType
   */
  public ErrorType getErrorType() {
    return errorType;
  }

  /**
   * Additional information about the error that is not included in the ErrorType.
   *
   * @return additionalDescription
   */
  public String getAdditionalDescription() {
    return additionalDescription;
  }

  /**
   * Whether or not the Throwable that caused the error is attached to this object.
   *
   * @return boolean
   */
  public boolean isCausePresent() {
    return cause != null;
  }

  /**
   * The Throwable caught while trapping and identifying the error.
   * 
   * @return Throwable cause
   */
  public Throwable getCause() {
    return cause;
  }

  /**
   * {@inheritDoc}
   */
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("cause", cause).append("additionalDescription", additionalDescription).append("errorType", errorType).toString();
  }

  /**
   * Override hashCode.
   * 
   * @return the Objects hashcode.
   */
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, false);
  }

  /**
   * The object is uniquely identified by the id. {@inheritDoc}
   * 
   * @see Object#equals(Object)
   */
  public boolean equals(final Object obj) {
    boolean result = false;

    if (obj instanceof ServiceException) {
      if (this == obj) {
        result = true;
      } else {
        final ServiceException rhs = (ServiceException) obj;
        result = new EqualsBuilder().append(additionalDescription, rhs.additionalDescription).append(cause, rhs.cause).append(errorType, rhs.errorType).append(parameterizedValues, rhs.parameterizedValues).isEquals();
      }
    }

    return result;
  }
}
