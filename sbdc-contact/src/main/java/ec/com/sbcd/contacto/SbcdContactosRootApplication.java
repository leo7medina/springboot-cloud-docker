package ec.com.sbcd.contacto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ec.com.sbcd.contacto"})
@SpringBootApplication
public class SbcdContactosRootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbcdContactosRootApplication.class, args);
    }

}
