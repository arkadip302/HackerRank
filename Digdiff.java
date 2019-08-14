import java.util.*;
import java.lang.Math;
class diff
{
  public static void main(String args[])
  {
    int sum1=0,sum=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
        if(i==j)
        {
          sum=sum+arr[i][j];
        }
       if(j==n-i-1)
        {
          sum1=sum1+arr[i][j];
        }
      }
    }
    sum=sum-sum1;
    System.out.println(Math.abs(sum));
  }
}
