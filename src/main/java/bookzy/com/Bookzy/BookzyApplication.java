package bookzy.com.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages={"bookzy.com.Bookzy"})

@RequestMapping("/")

public class BookzyApplication {
	String home() {
        return "Hello World Spring Boot!";
    }

	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
	}

}
