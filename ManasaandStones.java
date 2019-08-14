import java.util.*;
import static java.lang.System.out;
class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0){
      int n=sc.nextInt();
      int result[]=new int[n];
      int a=sc.nextInt();
      int b=sc.nextInt();
      for(int i=n-1; i>-1; i--){
        if(a<b)
          System.out.print(((a*i)+(b*(n-1-i)))+" ");
        else if(a>b)
          System.out.print(((b*i)+(a*(n-1-i)))+" ");
        else{
          System.out.print(((a*i)+(b*(n-1-i))));
          break;
         }
        }
        System.out.println();
        t--;
    }
  }
}
