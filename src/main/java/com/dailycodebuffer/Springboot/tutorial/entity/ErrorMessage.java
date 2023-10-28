package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
//    this particular class will be sending back response
      private HttpStatus status;  //400, 405, 404, 500
      private String message;
}
