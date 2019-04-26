/**This class contains a ControllerAdvice that will be used throughout the application
 * to check for exceptions.
 * ExceptionHandler checks for specific classes that return exception messages.  */

package com.cg.tds.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.tds.exceptions.IdNotFoundException;
import com.cg.tds.model.ErrorDetails;

@ControllerAdvice
@RestController
public class ExceptionHandlerClass extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = IdNotFoundException.class)
	 public final ResponseEntity<ErrorDetails> handleNotFoundException(IdNotFoundException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
		        request.getDescription(false));
		    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	   }
}
