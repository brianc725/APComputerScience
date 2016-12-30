public class HighSchoolStudent extends Student
{
 
  private double GPA;
  
  public HighSchoolStudent(String fName, String lName, int gLevel, double gpa)
  {
   super(fName, lName, gLevel); 
   if ((gpa >=0)&&(gpa <=5))
   {
     GPA = gpa;
   }
  // else
  //   gpa = 0;
  }
  
  public String toString()
  {
  return (super.toString() + "\n" + "   " + "GPA: " + GPA);
  }
 
  
}