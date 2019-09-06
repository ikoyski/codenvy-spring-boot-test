package comikoyski.codenvyspringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.util.StringUtils;

@SpringBootApplication
public class CodenvySpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodenvySpringBootTestApplication.class, args);
	}
}

@RestController
@RequestMapping("/hello")
class HelloController{
  @RequestMapping
  public String hello(@RequestParam(required=false) String name){
    if(StringUtils.isEmpty(name))
      return "Hello World !\n";
    else
      return "Hello "+name+" !\n";
  }
}
