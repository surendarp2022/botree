package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerforversioning {
 //@GetMapping("v1/user")
 @GetMapping(value="/user/param", params="version=1")
  public User createUser() {
	 return new User("joseph vijay");
	 
 }
 //@GetMapping("v2/user")
 @GetMapping(value="/user/param", params="version=2")
  public UserV2 createUserV2() {
	 UserName name=new UserName("joseph", "vijay");
 UserV2 obj=new UserV2(name);
 return obj;
 
 
 //return new UserV2(new UserName("joseph", "vijay"));
  }
}