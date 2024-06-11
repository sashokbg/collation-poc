package com.example.demo;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Notification;
import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Pipelinr;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	Pipeline pipeline(ObjectProvider<Command.Handler> commandHandlers,
					  ObjectProvider<Notification.Handler> notificationHandlers,
					  ObjectProvider<Command.Middleware> middlewares) {
		return new Pipelinr()
				.with(commandHandlers::stream)
				.with(notificationHandlers::stream)
				.with(middlewares::orderedStream);
	}
}
