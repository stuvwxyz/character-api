package org.gordianknots.charactersapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping
  String hello() {
    return "Hello Character API!";
  }
}
