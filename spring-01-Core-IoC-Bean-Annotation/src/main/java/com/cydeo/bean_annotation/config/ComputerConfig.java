package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean
    public Monitor monitorSony(){
        return  new SonyMonitor("mod", "Sony", 12);
    }


    @Bean
    @Primary //makes this the default bean for monitors
    public Monitor monitorAcer(){
        return  new AcerMonitor("Acer300" , "Acer", 17);
    }

    @Bean
    public Case caseDell(){
        return new DellCase("Cool Laptop", "Dell", "20v");
    }

    @Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("LightWide4500", "Asus", 4, 2, "Som");
    }
}
