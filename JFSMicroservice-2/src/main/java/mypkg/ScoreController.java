package mypkg;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ScoreController {

 @GetMapping("/score")
	  public String score()
	  {
		  return"welcome to scorepage";
	  }
      @Bean
      @LoadBalanced
      public RestTemplate createRestTemplate() {
    	  return new RestTemplate();
      }
 
 
}
