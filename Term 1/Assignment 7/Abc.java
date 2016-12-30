

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Abc{


public static void main (String str[]) throws IOException {

   Scanner scan = new Scanner (System.in);
       System.out.println("Enter a base ten number between 0 and 255, inclusive.");
       int [] a = {0,0,0,1,0,0,1,1};
       int [] b = {0,1,1,0,1,0,0,1};
  
      

   int carry = 0;
      int [] c = new int [8];
      for (int i =0; i <8; i++)
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
      
      System.out.print (c[i] + " ");

   
   
      }}}
