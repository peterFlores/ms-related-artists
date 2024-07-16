package com.pflores.msrelatedartists;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsRelatedArtistsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRelatedArtistsApplication.class, args);
    }

}
