import java.util.*;
class Solution{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int min=Integer.MAX_VALUE;
    int n=in.nextInt();
    int m=in.nextInt();
    int result[]=new int[n];
    int c[]=new int[m];
    for(int i=0;i<m;i++)
    c[i]=in.nextInt();
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(min>Math.abs(c[j]-i)){
        min=Math.abs(c[j]-i);
      }
      }
      result[i]=min;
      min=Integer.MAX_VALUE;
    }
    System.out.println(Arrays.stream(result).max().getAsInt());
  }
}
