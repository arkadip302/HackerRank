import java.util.*;
class Solution{
  public static long find_largest(long query[],int val_st,int val_end,int k){
    for(int i=val_st;i<=val_end;i++){
      query[i]=query[i]+k;
    }
    long max = query[0];

         // Traverse array elements from second and
         // compare every element with current max
    for (int i = 1; i < query.length; i++)
      if (query[i] > max)
       max = query[i];
    return(max);
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long max=0;
    int n=sc.nextInt();
    int m=sc.nextInt();
    int list[][]=new int[m][3];
    long query[]=new long[n];
    for(int i=0;i<m;i++){
      for(int j=0;j<3;j++){
        list[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<m;i++){
      long temp=find_largest(query,list[i][0]-1,list[i][1]-1,list[i][2]);

      if(max<temp)
      max=temp;
    }
    System.out.println(max);
  }
}
