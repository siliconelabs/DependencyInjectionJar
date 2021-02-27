package com.FirstSpringBootDependencyInjection2.DependencyInjectionJar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class DateTimeConfig {

    @Bean("getBirth1")
    public LocalDate getBirthDate()
    {
        System.out.println("getBirthDate calıstı");
        return LocalDate.of(1984,10,10);

    }
    @Bean("getBirth2")
    public LocalDate getBirthDate2()
    {
        System.out.println("getBirthDate2 calıstı");
        return LocalDate.of(1986,10,10);

    }


}
