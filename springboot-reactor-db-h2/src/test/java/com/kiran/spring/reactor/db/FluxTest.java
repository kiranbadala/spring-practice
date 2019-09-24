package com.kiran.spring.reactor.db;

import java.util.function.Consumer;

import org.junit.Test;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

public class FluxTest {

	@Test
	public void test() {
		WebClient client = WebClient.builder().baseUrl("http://localhost:8080/user").build();
		client.get().exchange().subscribe(new Consumer<ClientResponse>() {

			@Override
			public void accept(ClientResponse t) {
				t.bodyToFlux(Long.class).subscribe(new Consumer<Long>() {

					@Override
					public void accept(Long t) {
						System.out.println("Accepted : " + t.toString());
					}
				});
			}
		});
	}

}
