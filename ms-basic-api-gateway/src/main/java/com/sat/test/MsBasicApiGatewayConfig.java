package com.sat.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MsBasicApiGatewayConfig {

	@Autowired
	MsBasicApiGatewayAuthFilter auth;
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//http://localhost:8765/hello
//http://localhost:8765/first		
//http://localhost:8765/first/first
//http://localhost:8765/chello
		
		System.out.println("Inside gatewayRouter");
		return builder.routes()
				.route(p -> p.path("/get").uri("http://httpbin.org:80"))
				
//				.route("ms-basic-first", t -> t.path("/hello")
//						.filters(f-> f.filters((GatewayFilter) auth).rewritePath("/hello(?<segment>.*)", "/first${segment}")).uri("lb://ms-basic-first"))
//				.route("ms-basic-first", r -> r.path("/first**").uri("lb://ms-basic-first"))
//				.route("ms-basic-first", r -> r.path("/first/first").filters(f -> f.stripPrefix(1)).uri("lb://ms-basic-first"))				
//				.route("ms-basic-first", t -> t.path("/chello**").filters(rw -> rw.rewritePath("/chello(?<segment>.*)", "/first${segment}")).uri("lb://ms-basic-first"))
				
//				.route("ms-basic-second", t -> t.path("/second**").filters(rw -> rw.rewritePath("/second(?<segment>.*)", "/second${segment}")).uri("lb://ms-basic-second"))
				
//				.route("ms-basic-first", t -> t.path("/hello").filters(rw -> rw.rewritePath("/hello(?<segment>.*)", "/hello/hello${segment}")).uri("http://localhost:8000"))				
//				.route("ms-basic-first", r -> r.path("/hello/hello").uri("http://localhost:8000"))
//				.route("ms-basic-first", r -> r.path("/hello/hello/hello").filters(f -> f.stripPrefix(1)).uri("http://localhost:8000"))				
//				.route("ms-basic-first", t -> t.path("/chello**").filters(rw -> rw.rewritePath("/chello(?<segment>.*)", "/hello/hello${segment}")).uri("http://localhost:8000"))				
				
				.build();
		
		
	}
}


