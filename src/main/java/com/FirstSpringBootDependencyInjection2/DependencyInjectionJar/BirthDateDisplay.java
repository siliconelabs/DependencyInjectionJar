package com.FirstSpringBootDependencyInjection2.DependencyInjectionJar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class BirthDateDisplay
{
    public LocalDate localdate;

   @Autowired
    public  DateTime date1;

    @Autowired
    public BirthDateDisplay(@Qualifier("getBirth2") LocalDate birthDate) {
        System.out.println("BirthdateDisplay olusturuldu");
     localdate=birthDate;

    }

    @PostConstruct
    public void display()
    {

        System.out.printf("BirthDate is %s %n", DateTimeFormatter.ofPattern("dd-MM-yyy").format(localdate));


    }



}
