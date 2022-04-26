package ru.orlov.boot_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Pp331BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pp331BootApplication.class, args);
    }

}
