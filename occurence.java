import java.util.*;
class obj
{
  public static void main(String args[])
  {
    float p=0,n1=0,z=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(arr[i]<0)
      n1++;
      else if(arr[i]>0)
      p++;
      else
      z++;
    }
    System.out.println(p/(float)n);
    System.out.println(n1/(float)n);
    System.out.println(z/(float)n);
  }
}
