import java.util.*;
class solu{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int count=Integer.MAX_VALUE,z=0;
    int n=in.nextInt();
    int t=in.nextInt();
    int result[]=new int[t];
    int cases[][]=new int[t][2];
    int width[]=new int[n];
    for(int i=0;i<n;i++)
    width[i]=in.nextInt();
    for(int i=0;i<t;i++){
      for(int j=0;j<2;j++){
        cases[i][j]=in.nextInt();
      }
    }
    for(int i=0;i<t;i++){
        for(int k=cases[i][0];k<=cases[i][1];k++){
          System.out.println("test "+k);
          System.out.println("width "+width[k]);
          if(count>width[k]){
            System.out.println("Count for "+width[k]+" is"+count);
          count=width[k];
          }
        }
        result[z++]=count;
        count=Integer.MAX_VALUE;
      }
      for (int i=0;i<t;i++) {
        System.out.println(result[i]);
      }
      //return result;
    }
}
