import java.util.*;
class abc
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [] keyb=new int[n];
    int [] usb=new int[m];
    for(int i=0;i<n;i++)
      keyb[i]=sc.nextInt();
    for(int i=0;i<m;i++)
      usb[i]=sc.nextInt();
    int max=-1;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        System.out.println("VAlue is   "+ (keyb[i]+usb[j]));
        if((keyb[i]+usb[j])<b && (keyb[i]+usb[j])>max)
        {
            max=keyb[i]+usb[j];
        }
      }
    }
    System.out.println(max);
  }
}
