import java.util.*;
class tree
{
  public static void main(String args[])
  {
    int count=0,count1=0;
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int t=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[] apple=new int[m];
    int[] orange=new int[n];
    for(int i=0;i<m;i++)
    {
      apple[i]=sc.nextInt();
      if((apple[i]+a)>=s && (apple[i]+a)<=t)
      count++;
    }
    for(int i=0;i<n;i++)
    {
      orange[i]=sc.nextInt();
      if((orange[i]+b)>=s && (orange[i]+b)<=t)
      count1++;
    }
    System.out.println(count);
    System.out.println(count1);
  }
}
