package br.com.henrique.exceptions;

import java.io.Serializable;
import java.util.Date;
public class ExceptionResponse implements Serializable {

     private static final long serialVersionUID = 1L;

     private Date timestampo;
     private String message;
     private String details;

    public ExceptionResponse(Date timestampo, String message, String details) {
        this.timestampo = timestampo;
        this.message = message;
        this.details = details;
    }

    public Date getTimestampo() {
        return timestampo;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
