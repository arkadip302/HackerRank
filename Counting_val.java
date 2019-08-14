import java.util.*;
class ads
{
  public static void main(String args[])
  {
    int val=0,count=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    for(int i=0;i<n;i++)
    {
      char c=s.charAt(i);
      if(c=='U'){val++;}
      else if(c=='D'){val--;}
      if(val==0 && c=='U')
      {
        count++;
      }
    }
    System.out.println(count);
  }
}
