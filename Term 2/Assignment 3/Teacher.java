public class Teacher extends Person
{
  
  private String subject2;
  
  public Teacher(String fName, String lName, String subject)
  {
   super(fName, lName);
   subject2 = subject;
  }
  
  public String toString()
  {
   return(super.toString() + "\n" + "   Subject: " + subject2); 
  }
  
  
}