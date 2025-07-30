package org.utildemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class UtilDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtilDemoApplication.class, args);
    }

}
