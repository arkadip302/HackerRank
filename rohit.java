import java.util.*;
class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int q=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int result[]=new int[q];
    int query[]=new int[q];
    for(int i=0;i<q;i++)
    query[i]=sc.nextInt();
    while(k!=0){
      int last=a[n-1];
      for(int i=n-1;i>0;i--){
        a[i]=a[i-1];
      }
      a[0]=last;
      k--;
    }
    for(int i=0;i<q;i++)
    result[i]=a[query[i]];
    for(int i=0;i<q;i++)
    System.out.println(result[i]);
  }
}
