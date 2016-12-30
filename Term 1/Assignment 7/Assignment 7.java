/*
 * Assignment 7
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static int[] convertToBinary(int b)
     {
       int c = 0;
       int d = 0;
       
       if (b-128 < 0)
         c = 0;
       if (b-128 >=0)
       {
         c = 1;
         
          b = b-128;
       }
       if (b-64 < 0)
         d = 0;
       if (b-64 >=0)
       {
        d = 1;
        
         b = b-64; 
       }
       int e = 0;
       if (b-32 < 0)
         e = 0;
       if (b-32 >=0)
       {
         e = 1;
         
            b = b-32;
       }
       int f = 0;
       if (b - 16 <0)
         f = 0;
       if (b - 16 >= 0)
       {
        f = 1;
        
          b = b-16;
       }
       int g = 0;
       if (b - 8 <0)
         g = 0;
       if (b-8 >=0)
       {
         g= 1;
       
         b = b-8;
       }
       int h = 0;
       if (b-4 <0)
         h = 0;
       if (b-4 >=0)
       {
        h = 1;
        
          b= b-4;
       }
       int m = 0;
       if (b-2 <0)
         m = 0;
       if (b-2 >=0)
       {
        m =1;
        
          b=b-2;
       }
       int n = 0;
       if (b-1 <0)
         n = 0;
       if (b-1 >=0)
       {
        n = 1; 
       }
       int [] B = {n, m, h, g, f, e, d, c};
       return B;
     }
     
     public static void printBin(int b[])
     {
      for (int i= b.length-1; i >= 0; i--)
      System.out.print(b[i] + " ");
     }
     
    public static int [] addBin(int a[], int b[])
    {
      int carry = 0;
      int [] c = new int [8];
      for (int i =7; i >=0; i--)
      {
      int sum = 0;
      sum = (a[i] + b[i] + carry);
      if (sum == 0)
      {
      
       c[i] = sum;
       carry = 0;
       
      }
      else if (sum==1)
      {
       
        c[i]=sum;
        carry = 0;
        
      }
      else if (sum ==2)
      {
       
       c[i] = 0;
       carry = 1;
       
      }
      else if (sum == 3)
      {
       
       c[i]= 1;
       carry = 1;
       
      }
     
      else
        carry = 0;
      
      
      }
    return c;
    }
  
     public static void main (String str[]) throws IOException {
       
       Scanner scan = new Scanner (System.in);
       System.out.println("Enter a base ten number between 0 and 255, inclusive.");
       int x = scan.nextInt();
       System.out.println("Enter a base ten number between 0 and 255, inclusive.");
       int y = scan.nextInt();
       int [] a = convertToBinary(x);
       int [] c = convertToBinary(y);
       System.out.println ("First binary number:");
       printBin(a);
       System.out.println("\n" + "\n"  + "Second binary number:");
       printBin(c);
       System.out.println("\n" + "\n" + "Added:");
       if (x + y >255)
       System.out.println("Error: overflow");
       int [] j = addBin(a, c);
       printBin(j);
      
     }
}