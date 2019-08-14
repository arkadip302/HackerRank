import java.util.*;
class Solution{
  public static void main(String args[]){
    int p=16,d=2,m=1,s=9981;
    int count=0,value=0;
    while(value+p<s){
      value=value+p;
      //System.out.println("Value is "+value);
      //System.out.println("P "+p);
      if(p>m+d){
        p=p-d;
      }
      else
      {
        p=m;
      }
      count++;
    }
    System.out.println("Count "+count);
  }
}
