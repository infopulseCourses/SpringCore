package com;

import com.domain.AirCompany;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Stepan
 */
public class Main {



    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        AirCompany company = context.getBean("airCompany",AirCompany.class);
        Integer profit = company.totalProfit();
        System.out.println("Profit = " + profit);
    }
}
