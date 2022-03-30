package mypkg;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HomeConfig {
@Bean
@LoadBalanced
public RestTemplate createRestTemplate() {
	RestTemplate restTemplate=new RestTemplate();
	return new RestTemplate();
	
}
}
