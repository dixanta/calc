/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.calc;

import com.leapfrog.calc.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the value of x:");
            int x = input.nextInt();
            //c.setX(input.nextInt());
            System.out.println("Enter the value of y:");
            int y = input.nextInt();
            //c.setY(input.nextInt());
            
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("Enter your choice[1-3]:");
            int ch=input.nextInt();
            
            Calculator c = new Calculator(x, y);

            if(ch==1)
            {
                System.out.println(c.add());
            }
            else if(ch==2){
                System.out.println(c.sub());
            }
            else if(ch==3){
                System.out.println(c.mul());
            }
            else if(ch==4){
                System.out.println(c.power());
            }
            else{
                System.exit(0);
            }
            System.out.println("Do you want to continue[Y/N]");
            String choice=input.next();
            if(choice.equalsIgnoreCase("n")){
                System.exit(0);
            }
        }

    }

}
