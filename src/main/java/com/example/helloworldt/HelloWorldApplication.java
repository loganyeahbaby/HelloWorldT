package com.example.helloworldt;

        import lombok.extern.slf4j.Slf4j;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Logan
 */
@Slf4j
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        log.info("start");
        SpringApplication.run(HelloWorldApplication.class, args);
        log.info("done");
    }

}
