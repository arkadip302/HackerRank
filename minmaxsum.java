import java.util.*;
class maxmin
{
  public static void main(String args[])
  {
    long total=0;
    Scanner sc=new Scanner(System.in);
    long[] arr=new long[5];
    for(int i=0;i<5;i++){
      arr[i]=sc.nextLong();
      total+=arr[i];
    }
    long min=arr[0],max=arr[0];
    for(int i=0;i<5;i++){
      if(arr[i]>max){max=arr[i];}
      if(arr[i]<min){min=arr[i];}
    }
    System.out.println((total-max)+" "+(total-min));
  }
}
