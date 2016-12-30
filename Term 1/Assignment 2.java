import java.util.Scanner;
import java.lang.Math;


class Main {
    public static void main(String[] args) {
      
      
      /*Please Enter the Cost of the Item: 
4.57 
Please Enter the Amount Paid: 
5.00 
Change Owed: 0.43 
Quarters: 1
Dimes: 1
Nickels: 1 
Pennies: 3 */
      
      
 Scanner scan = new Scanner (System.in);
 System.out.println("Please Enter the Cost of the Item:");
 double cost = scan.nextDouble();
 System.out.println("Please Enter the Amount Paid:");
 double paid = scan.nextDouble();
 int ctemp = (int)Math.round(100*cost);
 int ptemp = (int)Math.round(100*paid);
 double change = ptemp-ctemp;
 System.out.println("Change Owed: " + change/100);
 int quart = (int) change/25;
 int dime = (int) (change%25)/10;
 int nick = (int) ((change%25)%10)/5;
 int pen = (int) (((change%25)%10)%5)/1;
 System.out.println("Quarters: " + quart);
 System.out.println("Dimes: " + dime);
 System.out.println("Nickels: " + nick);
 System.out.println("Pennies: " + pen);
      
      
      
      
      
      
      
      
      
      
      
    }
    
}