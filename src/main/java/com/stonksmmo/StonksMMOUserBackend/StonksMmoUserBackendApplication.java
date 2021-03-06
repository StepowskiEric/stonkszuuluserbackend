package com.stonksmmo.StonksMMOUserBackend;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;


@EnableEurekaServer
@EnableZuulProxy
@SpringBootApplication
public class StonksMmoUserBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StonksMmoUserBackendApplication.class, args);
	}

	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
		return ServerCodecConfigurer.create();
	}

}
