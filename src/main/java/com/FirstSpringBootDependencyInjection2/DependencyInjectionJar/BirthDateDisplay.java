package com.FirstSpringBootDependencyInjection2.DependencyInjectionJar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.siliconelabs.app.MathUtil;

@Component
public class BirthDateDisplay
{
    @Qualifier("getBirth1")
    @Autowired
    public LocalDate localdate;
    @Autowired
    List<LocalDate> list;

    @Autowired
    public void setLocaldate(@Qualifier(("getBirth2")) LocalDate localdate) {
        this.localdate = localdate;
    }


    @Autowired
    public  DateTime date1;


   //ApplicationContext
    // injection turleri  3  adettir
    // Constructor injection
    // Field injection
    // setter

    public BirthDateDisplay(@Qualifier("getBirth2") LocalDate birthDate) {
        System.out.println("BirthdateDisplay olusturuldu");

        MathUtil m=new MathUtil();
        m.print();
     localdate=birthDate;

    }

    @PostConstruct
    public void display()
    {


        System.out.println(date1);
        System.out.printf("BirthDate is %s %n", DateTimeFormatter.ofPattern("dd-MM-yyy").format(localdate));


    }



}
