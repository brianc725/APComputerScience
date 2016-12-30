/*
 * Assignment 6
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static void main (String str[]) throws IOException {
       
      Scanner scan = new Scanner (System.in);
      int flagfirst = 0;
      int flagsecond = 0;
      int firstlength = 0;
      int secondlength = 0;
      //start of first array
      int first [] = new int [10000]; 
      System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
      for (int i = 0; i < 10000; i++)
      {
        first [i] = scan.nextInt();
        firstlength++;
        if (first [i] < 0)
        {
              break;
        }
      }
      //end of first arraY
      //start of second array
      int second [] = new int [10000]; 
      System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
      for (int j = 0; j < 10000; j++)
      {
        second [j] = scan.nextInt();
        secondlength++;
        if (second [j] < 0)
        {
              break;
        }
      }
      //end of second array
      //start of checking order
      for (int i = 1; i < first.length-1; i++)
      {
        if (first[i] > 0 )
        {
        if(first[i] < first[i-1])
        {
            flagfirst = 1;
            break;
        }
      }
      }
      //end of checking order
      //start of checking order
      for (int i = 1; i < second.length-1; i++)
      {
        if (second[i]>0)
        {
        if(second[i] < second[i-1])
        {
            flagsecond = 1;
            break;
        } 
        }
      }
      //end of checking order
      //begin merging
      int merge [] = new int [10000];
        int m = 0;
        int f = 0;
        int s = 0;
        int c = 0;
        int d = 0;
        if (firstlength > secondlength)
        {
        while (c <firstlength)
        {
        if(first[f]<second[s])
        {
          merge[m] = first[f];
          f++;
          m++;
          c++;
        }
        if(first[f]>second[s])
        {
          merge[m] = second[s];
          s++;
          m++;
          c++;
        }
        if (first[f] == second[s])
        {
          int n = m+1;
          merge[m]=first[f];
          merge[n]=first[f];
          f++;
          s++;
          m+=2;
          c++;
        }
        while (d < firstlength-3){
        d = firstlength-secondlength-4;
        merge[m] = first[d];
        d++;
        m++;
        }   
        }
        }
         if (secondlength >= firstlength)
        {
        while (c <secondlength)
        {
        if(first[f]<second[s])
        {
          merge[m] = first[f];
          f++;
          m++;
          c++;
        }
        if(first[f]>second[s])
        {
          merge[m] = second[s];
          s++;
          m++;
          c++;
        }
        if (first[f] == second[s])
        {
          int n = m+1;
          merge[m]=first[f];
          merge[n]=first[f];
          f++;
          s++;
          m+=2;
          c++;
        }
        
       while (d < secondlength-3){
        d = secondlength-firstlength-4;
        merge[m] = second[d];
        d++;
        m++;
        }     
        }
         }
      //end merging
      //begin print array
        

      System.out.println("First Array:");
      for (int i = 0; i < first.length; i++)
      {
        if (first[i]>0)
        {
        System.out.print(first[i] + " ");
        }
      }
      System.out.println("\n" + "\n" + "Second Array:");
      for (int i = 0; i < second.length; i++)
      {
        if (second[i]>0)
        {
        System.out.print(second[i] + " ");
        }
      }
      if ((flagfirst == 0) && (flagsecond == 0))
      {
      System.out.println("\n" + "\n" + "Merged Array:");

      for (int i = 0; i < merge.length; i++)
      {
        if (merge[i]>0)
        {
        System.out.print(merge[i] + " ");
        }
      }
      }
      //end print array
     System.out.println(firstlength);
     System.out.println(secondlength);
      //for errors
    if ((flagfirst == 1) || (flagsecond == 1))
        System.out.println("\n" + "\n" +"ERROR: Array not in correct order");
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
        }
     }
     
