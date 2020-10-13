package edu.cnm.deepdive.codebreaker.model;

public class IllegalGuessCharacterException extends IllegalArgumentException {

  /**
   * Exception that extends{@link IllegalArgumentException for the length of the guess.}
   */
  public IllegalGuessCharacterException() {
  }
  /**
   * exception for incorrect characters used.
   */
  public IllegalGuessCharacterException(String message) {
    super(message);
  }

  /**
   *
   * @param message
   * @param cause
   */
  public IllegalGuessCharacterException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   *
   * @param cause
   */
  public IllegalGuessCharacterException(Throwable cause) {
    super(cause);
  }

}
