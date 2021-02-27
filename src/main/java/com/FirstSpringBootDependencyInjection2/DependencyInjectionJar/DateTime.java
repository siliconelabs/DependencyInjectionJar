package com.FirstSpringBootDependencyInjection2.DependencyInjectionJar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;


@Component
public class DateTime {

    @Autowired
    public LocalDateTime local;

    @Autowired
    public DateTime(LocalDateTime local) {

        System.out.println("DateTime Instance olusturuldu");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("init metodu calıstırıldı");
    }

    public void init2()
    {
        System.out.println("init2 metodu calıstırıldı");
    }

    public  void print()
    {
        System.out.println("....");
    }
}
