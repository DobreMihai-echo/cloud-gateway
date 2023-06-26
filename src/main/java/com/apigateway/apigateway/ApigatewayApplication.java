package com.apigateway.apigateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

//	@Bean
//	public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizer() {
//		return factory -> factory.configureDefault(
//				id -> new Resilience4JConfigBuilder(id).circuitBreakerConfig(CircuitBreakerConfig.ofDefaults()).build()
//		);
//	}

}
