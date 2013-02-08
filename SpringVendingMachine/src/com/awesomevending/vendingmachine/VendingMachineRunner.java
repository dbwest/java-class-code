package com.awesomevending.vendingmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VendingMachineRunner {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        System.out.println("Testing American Made Vending Machine");

        VendingMachine americanMachine = (VendingMachine) context.getBean("american");
        americanMachine.insertCoin("NICKEL");
        americanMachine.insertCoin("DIME");
        americanMachine.insertCoin("QUARTER");

        System.out.println(americanMachine.getDisplay());

        americanMachine.insertCoin("LOONIE");

        System.out.println(americanMachine.getDisplay());

        System.out.println("Testing American Made Vending Machine in Canada");

        VendingMachine canadianMachine = (VendingMachine) context.getBean("canadian");
        canadianMachine.insertCoin("NICKEL");
        canadianMachine.insertCoin("TOONIE");
        canadianMachine.insertCoin("LOONIE");

        System.out.println(canadianMachine.getDisplay());

        canadianMachine.insertCoin("SLUG");

        System.out.println(canadianMachine.getDisplay());

    }

}
