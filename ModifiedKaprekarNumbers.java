import java.util.*;
class Solution{
  public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int p=in.nextInt();
      int q=in.nextInt();

       for(int num=p;num<=q;num++){
        long sqr_p=(long)Math.pow(num,2);
        int d=Long.toString(sqr_p).length()/2;
        if(d==0 ){
          if(sqr_p==1)
          System.out.print(num+" ");
        }
        else{
        int sub_part1=Integer.parseInt(Long.toString(sqr_p).substring(0,d));
        int sub_part2=Integer.parseInt(Long.toString(sqr_p).substring(d));
        if(num==(sub_part1+sub_part2)){
          System.out.print(num+" ");
        }
      }
    }
  }
}
