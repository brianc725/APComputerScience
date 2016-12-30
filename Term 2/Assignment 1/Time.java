/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */

public class Time
{
     private int hour;
     private int minute;     
     
     /* Complete required constructors and methods here */
     
     /*
      *Default constructor that sets time to 1200.  
      */ 
     public Time()
     {
       this (12, 00);
     }
     
     /*
      * If h is between 1 and 23 inclusive, set the hour to h. 
      * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive, 
      * set the minutes to m. Otherwise, set the minutes to 0. 
      */ 
     public Time(int h, int m)
     {
       if ((h >= 1)&&(h <= 23))
         hour = h;
       else
         hour = 00;
       if ((m >= 0)&&(m <= 59))
         minute = m;
       else 
         minute = 00;
     }
     
     /* Returns the time as a String of length 4 in the format: 0819. 
      * Notice that if the hour or minute is one digit, it should 
      * print a zero first. For example, 6 should print as 06.
     */
     public String toString()
     {
    
      
      String combo = "";
      int hmin = 0;
       if ((hour <10)&&(minute<10))
        combo = "0" + hour + "0" + minute;
       if ((hour <10)&&(minute>=10))
        combo = "0" + hour + minute;
       if ((hour >=10)&&(minute <10))
        combo = hour + "0" + minute;
       if ((hour>=10)&&(minute>=10))
       {
        hmin = hour*100 + minute;
        combo = String.valueOf(hmin);
       }
       if ((hour ==0)&&(minute==0))
         combo = "0000";
       if ((hour == 0)&&(minute != 0))
         combo = "00" + minute;
       if ((hour != 0)&&(minute == 0))
         combo = hour + "00";
       if ((hour < 10)&&(minute == 0))
         combo = "0" + hour + "00";
       if ((hour == 0)&& (minute <10))
         combo = "000" + minute;
       
       return combo;
     
       
     }
    
     
     /*
      * Returns the time as a String converted from military time 
      * to standard time. For example, 0545 becomes 5:45 am and 
      * 1306 becomes 1:06 pm.
      */ 
     public String convert()
     {
       String day;
       String minutet = String.valueOf(minute);
       if ((hour >=0)&&(hour <=11))
         day = "am";
       else 
         day = "pm";
       int hourt = hour;
       if ((hour > 12)&&(hour < 24))
         hourt = hour -12;
       if (hour == 0)
         hourt = 12;
      
       if (minute == 0)
         minutet = "00";
       if (minute <10)
         minutet = "0" + minute;
       
       
    
       
       return hourt + ":" + minutet + " " + day;
       
     }
     
    /*
     * Advances the time by one minute. 
     * Remember that 60 minutes = 1 hour. 
     * Therefore, if your time was 0359, and you add one minute, 
     * it becomes 0400. 2359 should increment to 0000.
     */ 
    public void increment()
    {
      if (minute < 60)
        minute++;
      if(minute == 60)
      {
       minute = 0;
       hour++;
       if (hour ==24)
         hour = 00;
      }
    }
      
}