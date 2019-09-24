package com.kiran.spring.reactor.db;


import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.stereotype.Component;

import io.r2dbc.h2.H2ConnectionConfiguration;
import io.r2dbc.h2.H2ConnectionFactory;
import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.Result;

@Component
public class UserRepo {
	private static ConnectionFactory conFactory = new H2ConnectionFactory(
			H2ConnectionConfiguration.builder().inMemory("test").build());

public String getUser() {
	conFactory.create().subscribe(new Subscriber<Connection>() {

		@Override
		public void onSubscribe(Subscription s) {
			System.out.println("Hellow!");
		}

		@Override
		public void onNext(Connection t) {
			System.out.println("On Next.");
			t.createStatement("INSERT INTO USER (ID,FIRSTNAME) VALUES (1,'KIRAN')").execute();
			t.createStatement("SELECT ID,FIRSTNAME FROM USER").execute().subscribe( new Subscriber<Result>() {

				@Override
				public void onSubscribe(Subscription s) {
					
				}

				@Override
				public void onNext(Result t) {
					System.out.println("DB Result : "+t.toString());
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onComplete() {
					
				}
				
			});
		}

		@Override
		public void onError(Throwable t) {
			System.out.println("On Error.");
		}

		@Override
		public void onComplete() {
			System.out.println("Completed.");
		}
	});
	return "";
}
}
