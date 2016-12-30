/*
 * Assignment 3
 */
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Main{

     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
          String m = "";
          String d = "";
          System.out.println("What month were you born in?");
          int month = scan.nextInt();
          System.out.println("What day");
          int day = scan.nextInt();
          if ((month <= 0 || month >=13) || (day <= 0 || day >= 32) )
            System.out.println("error");
          if (month == 12)
            m = "December";
          if (month == 11)
            m = "November";
          if (month == 10)
            m = "October";
          if (month == 9)
            m = "September";
          if (month == 8)
            m = "August";
          if (month == 7)
            m = "July";
          if (month == 6)
            m = "June";
          if (month == 5)
            m = "May";
          if (month == 4)
            m = "April";
          if (month == 3)
            m = "March";
          if (month == 2)
            m = "February";
          if (month == 1)
            m = "January";
          if (day == 31)
            d = "thirty-first";
          if (day == 30)
            d= "thirtieth";
          if (day == 29)
            d = "twenty-ninth";
          if (day == 28)
            d = "twenty-eighth";
          if (day == 27)
            d = "twenty-seventh";
          if (day == 26)
            d = "twenty-sixth";
          if (day == 25)
            d = "twenty-fifth";
          if (day == 24)
            d = "twenty-fourth";
          if (day == 23)
            d = "twenty-third";
          if (day == 22)
            d = "twenty-second";
          if (day == 21)
            d = "twenty-first";
          if (day == 20)
            d = "twentieth";
          if (day == 19)
            d = "nineteenth";
          if (day == 18)
            d = "eighteenth";
          if (day == 17)
            d = "seventeenth";
          if (day == 16)
            d = "sixteenth";
          if (day == 15)
            d = "fifteenth";
          if (day == 14)
            d = "fourteenth";
          if (day == 13)
            d = "thirteenth";
          if (day == 12)
            d = "twelfth";
          if (day == 11)
            d = "eleventh";
          if (day == 10)
            d = "tenth";
          if (day == 9)
            d = "ninth";
          if (day == 8)
            d = "eighth";
          if (day == 7)
            d = "seventh";
          if (day ==6)
            d = "sixth";
          if (day == 5)
            d = "fifth";
          if (day == 4)
            d = "fourth";
          if (day == 3)
            d = "third";
          if (day == 2)
            d = "second";
          if (day == 1)
            d = "first";
          
          if ((month >= 0 && month <= 12) && (day >= 0 && day <= 31))
            System.out.println("Your birthday is: " + m + " " + d);
         
          
          if (month == 3 && day >= 21 && day <=31)
            System.out.println("Aries");
          if (month == 4 && day>=0 && day <= 19)
            System.out.println("Aries");
          if (month == 4 && day >= 20)
            System.out.println("Taurus");
          if (month == 5 && day <= 20)
            System.out.println("Taurus");
          if (month == 5 && day >= 21)
            System.out.println("Gemini");
          if (month == 6 && day <= 20)
            System.out.println("Gemini");
          if (month == 6 && day >= 21)
            System.out.println("Cancer");
          if (month == 7 && day <= 22)
            System.out.println("Cancer");
          if (month == 7 && day >= 23)
            System.out.println("Leo");
          if (month == 8 && day <= 22)
            System.out.println("Leo");
          if (month == 8 && day >= 23)
            System.out.println("Virgo");
          if (month == 9 && day <= 22)
            System.out.println("Virgo");
          if (month == 9 && day >= 23)
            System.out.println("Libra");
          if (month == 10 && day <= 22)
            System.out.println("Libra");
          if (month == 10 && day >= 23)
            System.out.println("Scorpio");
          if (month == 11 && day <= 21)
            System.out.println("Scorpio");
          if (month == 11 && day >= 22)
            System.out.println("Sagittarius");
          if (month == 12 && day <= 21)
            System.out.println("Sagittarius");
          if (month == 12 && day >= 22)
            System.out.println("Capricorn");
          if (month == 1 && day <= 19)
            System.out.println("Capricorn");
          if (month == 1 && day >= 20)
            System.out.println("Aquarius");
          if (month == 2 && day <= 18)
            System.out.println("Aquarius");
          if (month == 2 && day >= 19)
            System.out.println("Pisces");
          if (month == 3 && day <= 20)
            System.out.println("Pisces");
       
         
     }

}


