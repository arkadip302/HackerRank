import java.util.*;
class solu{
  public static void main(String args[]){
    int min=Integer.MAX_VALUE,count=Integer.MAX_VALUE;
    int a[]=new int[]{7,1,3,4,1,7};
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
                   count=Math.abs(j-i);
                   System.out.println("Count for "+a[i]+" "+a[j]+" = "+count);
               }
               if(count<min){
                   min=count;
               }
           }
       }
       if(min<Integer.MAX_VALUE)
       System.out.println("-1");
       
       System.out.println(min);
  }
}
