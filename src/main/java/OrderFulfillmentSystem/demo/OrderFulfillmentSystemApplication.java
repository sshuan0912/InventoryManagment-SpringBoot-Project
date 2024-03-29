package OrderFulfillmentSystem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
public class OrderFulfillmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderFulfillmentSystemApplication.class, args);
	}

}
