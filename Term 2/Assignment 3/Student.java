public class Student extends Person
{
  private static int studentID = 0;
  private int level;
  private int ID;
  
  public Student(String fName, String lName, int gLevel)
  {
    super (fName, lName);
    studentID++;
    ID = studentID;
    if ((gLevel >= 0)&&(gLevel<=12))
    {
      level = gLevel;
    }
    else
      level = 0;
  }
  
  public int getLevel()
  {
    return level;
  }
  
  public String toString()
  {
    return (super.toString() + "\n" + "   " + "Grade Level: " + level + "\n" + "   " + "ID #: " + ID);
  }
}