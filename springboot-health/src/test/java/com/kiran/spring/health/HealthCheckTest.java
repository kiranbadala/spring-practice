package com.kiran.spring.health;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HealthCheckTest {
private RestTemplate client = new RestTemplate();
	
	@Test
	public void test() {
		for(long num=0;num<=100000000;num++) {
			try {
			 ResponseEntity<String> resp = client.exchange("https://business-configuration-odata-service-bcr-test.cfapps.sap.hana.ondemand.com/healthcheck", HttpMethod.GET,new HttpEntity(""), String.class,"");
			 System.out.println("Respone from health : "+resp.getBody());
			 Thread.sleep(10000);
			}catch(Exception e) {
				System.out.println("Error : "+e.getMessage());
			}
		}
	}

}
