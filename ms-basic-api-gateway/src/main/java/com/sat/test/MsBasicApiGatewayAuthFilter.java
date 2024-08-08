package com.sat.test;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;


@Component
public class MsBasicApiGatewayAuthFilter  extends AbstractGatewayFilterFactory<Object>    {

//	@Override
//	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//		System.out.println("I am in Auth code");
//		return chain.filter(exchange);
//	}

    @Override
    public GatewayFilter apply(Object config) {
    	System.out.println("I am in Auth code");
        return (exchange, chain) -> {
            return chain.filter(exchange);
        };
	}
}
