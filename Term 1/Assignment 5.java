/*
 * Assignment 5
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static void main (String str[]) throws IOException {
       
       Scanner scan = new Scanner (System.in);
       String err1 = " ";
       String err2 = " ";
       String sfirst = " ";
       String efirst = " ";
       int t = 0;
       System.out.println("Enter the first String:");
       String first = scan.nextLine();
       System.out.println("Enter the replacement String:");
       String second = scan.nextLine();
       String [] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " ", "\t", "*"};
       for (int i = 0; i < first.length(); i++)
       {
         if(!first.contains("*"))
           {
             err1 = "Error: no*";
             t = 1;
         }
         if (t!=1){
         for (int j = 0; j < alphabet.length; j++)
         {
           String firstl = first.toLowerCase();
           if((firstl.contains("#"))||(firstl.contains("!"))||(firstl.contains("@"))||(firstl.contains("$"))||(firstl.contains("^"))||(firstl.contains("("))||(firstl.contains(")"))||(firstl.contains("?")))
           {
           t=2;
            }
         
           }
         }
             break;
        }
     
       
          
           
            
       if (t ==1)
       {
         System.out.println(err1); 
       }
       else if (t ==2)
       {
         err2 = "Error: Incorrect characters";
         System.out.println(err2);
       }
       else
       {
       int f = first.indexOf('*');
       int e = first.length()-1;
       sfirst = first.substring(0,f);
       efirst = first.substring(f+1,e+1); 
       System.out.println(sfirst + second + efirst);
       }
       
       
       
       
     }
     
}