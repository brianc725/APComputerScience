/*
 * Assignment 4
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static void main (String str[]) throws IOException {

       Scanner scan = new Scanner (System.in);
       int a = 0;
       int b = 0;
       int e = 0;
       System.out.println("Please enter a tweet:");
       String tweet = scan.nextLine();


       if (tweet.length() <=140)
       {
         System.out.println("Length Correct");
         //hashtag
        for (int i = 0; i < tweet.length()-1; i++)
         {
          int j = i+1;
           if (tweet.charAt(i) == '#')
           {
             if ((tweet.charAt(j) != ' ')&&(tweet.charAt(j) != '\t'))
             a++;
           }
         }
        //attributions
        for (int f = 0; f < tweet.length()-1; f++)
         {
          int g = f+1;
           if (tweet.charAt(f) == '@')
           {
             if ((tweet.charAt(g) != ' ')&&(tweet.charAt(g) != '\t'))
             b++;
           }
         }
        //links
       String tweetlower = tweet.toLowerCase();
       for (int z =0; z <tweet.length()-1; z++)
       {
        int y =z+1;
        int s = y+1;
        int m = s+1;
        int n = m+1;
        int w = n+1;
        int q = w+1;
        if (tweetlower.charAt(z)== 'h')
        {
          if (tweetlower.charAt(y)== 't')
          {
            if (tweetlower.charAt(s) == 't')
            {
             if (tweetlower.charAt(m) == 'p')
             {
              if (tweetlower.charAt(n) == ':')
              {
               if (tweetlower.charAt(w) == '/')
               {
                if (tweetlower.charAt(q) == '/')
                {
                  e++;
                }
               }
              }
             }
            }
          }
         }
       }

       System.out.println("Number of Hashtags: " + a);
       System.out.println("Number of Attributions: " + b);
       System.out.println("Number of Links: " + e);
       }
       else 
         System.out.println("Excess Characters: " + (tweet.length()-140));

     }
 
}
     
    
     
     


