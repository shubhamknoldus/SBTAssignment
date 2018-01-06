package com.sbtAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to calculator press 1 to enter calculator menu");
        Scanner reader = new Scanner(System.in);
        int x=reader.nextInt();
        while(x==1)
        {
            Calculator calObject;
            System.out.println("please select the desired option");
            System.out.println("Press 1 to perform an arithmatic operation");
            System.out.println("Press 2 to view operations");
            System.out.println("Press 3 to exit");
            x=reader.nextInt();
            if(x==1)
            {
                calObject=new Calculator();
                calObject.displayOperations(calObject);
            }
            else if(x==2)
            {
                Calculator.viewOperations();
            }
            else
            {

            }
        }
    }
}

