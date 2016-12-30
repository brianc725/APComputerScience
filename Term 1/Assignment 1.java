/*
 * Lesson 6 Coding Activity Question 1
 
double x = (11+4)/2
 
 * What answer do you get? The answer is imprecise!
 *
 * Write a Java program that precisely calculates the average 
 * between two integers that input from the keyboard, and prints 
 * the answer to the screen. The average must include the integer 
 * and decimal portions of the calculation.
 *
 * Sample Run:
 
Please enter two integers:
4
11

The average is: 7.5

*/

import java.util.Scanner;
import java.lang.Math;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */

      Scanner scan = new Scanner (System.in);
      System.out.println("Please enter your test grades.");
      int test1 = scan.nextInt();
      int test2 = scan.nextInt();
      System.out.println("Please enter your quiz grades.");
      int quiz1 = scan.nextInt();
      int quiz2 = scan.nextInt();
      int quiz3 = scan.nextInt();
      System.out.println("Please enter your homework average.");
      double hw = scan.nextDouble();
      double tavg = (double)(test1 + test2)/2;
      double quizavg = (double)(quiz1 + quiz2 + quiz3)/3;
      System.out.println("Test Average: " + tavg);
      System.out.println("Quiz Average: " + quizavg);
      double f = 0.50*(tavg) + 0.30*(quizavg) + 0.20*(hw);
      System.out.println("Final Grade: " + f);
      

    }
}