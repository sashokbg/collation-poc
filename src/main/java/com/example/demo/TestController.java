package com.example.demo;

import an.awesome.pipelinr.Pipeline;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  private final Pipeline pipeline;

  public TestController(Pipeline pipeline) {
    this.pipeline = pipeline;
  }

  @GetMapping
  public ResponseEntity<Void> endPointTest() {
    AddBeneficiariesCommand command = new AddBeneficiariesCommand();
    command.execute(pipeline);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
