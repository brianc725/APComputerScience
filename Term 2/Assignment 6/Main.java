import java.io.*;
import static java.lang.System.*;
import java.util.ArrayList;

import java.util.Scanner;

class Main{

public static void sortAndPrint(ArrayList <String> n)
{
  String pointer = "";
  int j = 0;
  String temp = "";
  for (int i = 1; i < n.size(); i++)
  {
    pointer = n.get(i);
    j = i-1;   
    while ((j>=0)&&(pointer.compareTo(n.get(j))<=-1))
    {
      temp = n.get(j);
      n.set(j, n.get(j+1));
      n.set (j+1, temp);
      j--;
    }
  }
 
  
}
 
  public static String toString(ArrayList <String> n)
  {
   String total = "";
   for (String a: n)
    total += a + ", ";
    return total;
  }
  
  public static String titleCase(String s)
  {
     String nLower = s.toLowerCase();
       String nFirst = nLower.substring(0,1);
       String nSecond = nLower.substring(1,s.length());
       String nFirstCap = nFirst.toUpperCase();
       String nFinal = nFirstCap + nSecond;
       return nFinal;
  }
 
     public static void main (String str[]) throws IOException {
     Scanner scan = new Scanner (System.in);
     ArrayList <String> names = new ArrayList <String> ();  
     ArrayList <String> nameSorted = new ArrayList <String> ();
     //entering names
     int c = 1;
     while (c == 1)
     {
       System.out.println("Enter the next name:");
       String n = scan.nextLine();
       if (n.toUpperCase().equals("STOP"))
       {
         c = 0;
       }
       else 
       {
       String nameTitle = titleCase(n);
       names.add(nameTitle);
       }
      
     }
      sortAndPrint(names); 
      System.out.println(toString(names));
     //end entering names
     
   
     
     
     }
     

}