package com.FirstSpringBootDependencyInjection2.DependencyInjectionJar;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class DateTime {

    public DateTime() {

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
