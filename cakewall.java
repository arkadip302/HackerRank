import java.util.*;
class cake
{
  public static void main(String args[])
  {
    double value=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] cakes=new int[n];
    for(int i=0;i<n;i++)
      cakes[i]=sc.nextInt();
    Arrays.sort(cakes);
    for(int i=n-1;i>=0;i--)
    {
        value=Math.pow(2,(n-i-1))*cakes[i]+value;
        System.out.println("val "+value);
    }
    System.out.println((int)value);
  }
}
