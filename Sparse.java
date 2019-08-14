import java.util.*;
//import java.String;
import java.io.*;
class sparse
{
  public static void main(String args[])
  {
    int count=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.nextLine();
    }
    int q=sc.nextInt();
    sc.nextLine();
    String[] qu=new String[q];
    for(int i=0;i<q;i++)
    {
      qu[i]=sc.nextLine();
    }
    for(int i=0;i<q;i++)
    {
      count=0;
      for(int j=0;j<n;j++)
      {
        boolean a=qu[i].equals(s[j]);
        if(a==true)
        {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
