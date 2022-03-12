package ec.com.sbcd.contacto;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Slf4j
@SpringBootApplication(scanBasePackages = {"ec.com.sbcd.contacto"})
public class SbcdContactosRootApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SbcdContactosRootApplication.class, args);
            log.info("*********************************** Inicio de sistema ******************************************");
        } catch(Exception throwable) {
            log.error("*************************************Ha ocurrido una exception**********************************");
            log.error("Exception: " + throwable.toString());
            log.error("Root Cause: " + ExceptionUtils.getRootCause(throwable).toString());
        }
    }

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }

}
