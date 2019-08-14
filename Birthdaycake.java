import java.util.*;
class birthday
{
  public static void main(String args[])
  {
    int count=0;
    Scanner sc=new Scanner(System.in);
    //long n=sc.nextLong();
    int n=sc.nextInt();
    long[] arr=new long[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextLong();
    long max=arr[0];
    for(int i=0;i<n;i++)
    {
      if(arr[i]>max){max=arr[i]}
      if(arr[i]==max){count++;}
    }
    System.out.println(count);
  }
}
