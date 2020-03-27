package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * Run class implements the digital time
 * @author Rajabi2001
 * @version 1.00
 */
public class Run {


    public static void main(String[] args) throws InterruptedException {

        Date myDate=new Date();
        ClockDisplay time = new ClockDisplay(myDate.getHours(),myDate.getMinutes(),myDate.getSeconds());

        while (true){
            System.out.println(time.getTime());

            //time for go to next situation
            Thread.sleep(1000);

            time.timeTick();
        }
    }
}
