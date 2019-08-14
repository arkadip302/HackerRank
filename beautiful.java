import java.util.*;
class beauty
{
  static int rev_num(int n)
  {
    int r=0;
    while(n>0)
    {
      int d=n%10;
       r=d*10+r;
      n=n/10;
    }
    return(r);
  }
  public static void main(String args[])
  {
    int count=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[m-n+1];
    arr[0]=n;
    for(int i=1;i<=n;i++)
    {
      arr[i]=n+i;
      int c=rev_num(arr[i]);
      if((Math.abs(arr[i]-c)%k)==0){count++;}
    }
  }
}
