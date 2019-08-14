import java.util.*;
class kang
{
  public static void main(String args[])
  {
    String s=" ";
    int f=0;
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int v1=sc.nextInt();
    int x2=sc.nextInt();
    int v2=sc.nextInt();
    for(int i=0;i<10000;i++)
    {
      if((x1+i*v1)==(x2+i*v2))
      {
        s="YES";f=1;break;
      }
    }
    if(f!=1)
    {
      s="NO";
    }
    System.out.println(s);
  }
}
