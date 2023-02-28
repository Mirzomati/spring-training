package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest{
    public static void main(String[] args) {

        System.out.println("Creatign Containter");

        //creating container by using Application context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);

        //Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();

        System.out.println("Retreving the beans");
        //Asking the container to give you the specified objects
        SonyMonitor monitor1 = container.getBean(SonyMonitor.class);
        AsusMotherboard motherboard1 = container.getBean(AsusMotherboard.class);
        DellCase casee1 = container.getBean(DellCase.class);

      // 2nd way ******
        Monitor monitor = container.getBean(Monitor.class);
        Motherboard motherboard = container.getBean(Motherboard.class);
        Case casee = container.getBean(Case.class);

      //  PC myPc2 = new PC(casee1, monitor1, motherboard1);

      //  PC myPc = new PC(casee, monitor, motherboard);

     //   myPc.powerUp();

        System.out.println("**************** Multiple objects**************");

    //    Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class); ///Default Bean NAME
        Monitor theMonitor3 = container.getBean(Monitor.class); //@Primary
        PC myPc3 = new PC(casee, theMonitor3, motherboard);
        myPc3.powerUp();
    }
}