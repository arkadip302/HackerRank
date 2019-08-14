import java.util.*;
import java.lang.Math;

class Sol{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while(q!=0){
            int a = sc.nextInt();
            System.out.println(a);
            int b = sc.nextInt();
            int n = sc.nextInt();
            int[] arr=new int[n];
            int sum=a;
            for(int i=0;i<n;i++){
                sum=((int)Math.pow(2,i)*b)+sum;
                arr[i]=sum;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            sum=0;
            System.out.println();
            q--;
    }
  }
}
