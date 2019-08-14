import java.util.*;
class bigsum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long sum=0L;
    int n=sc.nextInt();
    long[] arr=new long[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextLong();
      sum=sum+arr[i];
    }
    System.out.println(sum);
  }
}
