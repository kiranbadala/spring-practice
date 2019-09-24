package com.kiran.spring.reactor.db;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.r2dbc.h2.H2ConnectionConfiguration;
import io.r2dbc.h2.H2ConnectionFactory;
import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactory;

@SpringBootApplication
public class SpringbootReactorDbH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactorDbH2Application.class, args);
		ConnectionFactory conFactory = new H2ConnectionFactory(
				H2ConnectionConfiguration.builder().inMemory("test").build());
		conFactory.create().subscribe(new Subscriber<Connection>() {

			@Override
			public void onSubscribe(Subscription s) {
				s.request(5);
			}

			@Override
			public void onNext(Connection t) {
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub

			}
		});
	}

}
