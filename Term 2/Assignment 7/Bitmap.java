
public class Bitmap{
  
  private String image[][] = new String[10][10];

 
  public Bitmap (int a[])
  {
    int correct = 0;
    for (int r = 0; r < image.length; r++)
    {
     for (int c = 0; c < image.length; c++)
       image[r][c]= "-";
    }
     if (a.length %2 !=0)
     correct = 21;
    
   for (int i =0; i<a.length; i++)
   {
    if ((a[i]<0)||(a[i]>10)) 
    {
     correct = 14;
    }
   }

   
   if (correct == 0)
   {
     for (int i = 0; i<a.length; i+=2)
     {       
      image[a[i]][a[i+1]] = "*";
     }
   } 
  }

  
  public void flipHorizontal()
  {
    String temp = "";
   for (int r =0; r<image.length; r++)
   {
    for (int c = 0; c<image.length/2; c++)
    {
     temp = image[r][c];
     image[r][c]=image[r][9-c];
     image[r][9-c] = temp;
    }
   }
  }
  
  public void flipVertical()
    {
    String temp = "";
   for (int c =0; c<image.length; c++)
   {
    for (int r = 0; r<image.length/2; r++)
    {
     temp = image[r][c];
     image[r][c]=image[9-r][c];
     image[9-r][c] = temp;
    }
   }
  }
  
  public void reverse()
  {
    for (int r = 0; r < image.length; r++)
    {
      for (int c = 0; c < image[r].length; c++)
      {
       if (image[r][c].equals("*"))
       {
        image[r][c] = "-"; 
       }
       else
       {
        image[r][c]="*";
       }
      }
    }
  }
  
  public String toString()
  {
    String grid = "";


      for (int r = 0; r < image.length; r++)
   {
     for (int c = 0; c < image.length; c++)
     {
       grid += image[r][c];
     }
      grid += "\n";
   }
    
    
  return grid;   
  }
  
}