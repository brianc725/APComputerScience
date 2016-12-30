import java.util.ArrayList;


public class School 
{

  ArrayList<Student> students = new ArrayList <Student>();
  ArrayList<Teacher> teachers = new ArrayList <Teacher>();
 
 public School(ArrayList<Student> students, ArrayList<Teacher> teachers)
 {
   this.students = students;
   this.teachers = teachers;
 }
  
 public String getGradeLevel(int level)
 {
   String stus = "";
   for(Student s: students)
   {
    if (s.getLevel()==level)
      stus = stus + s + "\n";
   }
   return stus;
 }
  
  public String toString()
  {
   String teap = "";
   String stup = "";
   
    for (Teacher t: teachers)
      teap = teap + t + "\n";
    for (Student s: students)
      stup = stup + s + "\n";
    
   return ("Faculty: \n" + teap + "\n\n" + "Student Body: " + stup);
     
  }
  
             
  }
  
