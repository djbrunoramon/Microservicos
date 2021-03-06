package com.brdomain.crud.exception;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse implements Serializable{ 
 
	private static final long serialVersionUID = -2638475120624858334L;

	private Date timestamp;
	private String message;
	private String details;
}
