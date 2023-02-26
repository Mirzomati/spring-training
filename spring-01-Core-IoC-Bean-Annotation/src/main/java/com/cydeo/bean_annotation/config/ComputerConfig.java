package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {

    @Bean
    public Monitor monitorSony(){
        return  new SonyMonitor("mod", "ssd", 12);
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
