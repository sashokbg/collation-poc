package com.example.demo;

import an.awesome.pipelinr.Pipeline;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private Pipeline pipeline;


	@Test
	void contextLoads() {
		AddBeneficiariesCommand command = new AddBeneficiariesCommand();
		command.execute(pipeline);
	}

}
