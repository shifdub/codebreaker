package edu.cnm.deepdive.codebreaker.model;

public class IllegalGuessLengthException extends IllegalArgumentException {

  /**
   *
   */
  public IllegalGuessLengthException() {
  }

  /**
   *
   * @param 
   */
  public IllegalGuessLengthException(String message) {
    super(message);
  }
  /**
   *
   * throws illegalguesslength exception when guess is incorrect length
   */
  public IllegalGuessLengthException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * {@link Throwable }
   * @param cause
   */
  public IllegalGuessLengthException(Throwable cause) {
    super(cause);
  }

}
