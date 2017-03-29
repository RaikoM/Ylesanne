package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Created by raiko on 27/03/2017.
 */
@SpringBootApplication
@EnableSwagger2
public class Application {
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
