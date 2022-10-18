package com.hm.nLayeredDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
  SpringFox paketi, projemizdeki tüm controller'ları tarayıp içindeki API' leri dökümantasyon haline getirip test etmemizi kolaylaştıran bir kütüphanedir.
  SpringFoxConfig sınıfı içerisinde tanımlamış olduğumuz Docket sınıfı tipinde api metodu ile proje çalıştığında o da tetiklenecek.
*/
@SpringBootApplication
@EnableSwagger2
public class NLayeredDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NLayeredDemoApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hm.nLayeredDemo"))
                .build();
    }


}
