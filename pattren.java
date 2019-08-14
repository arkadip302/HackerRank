import java.util.*;
import java.io.*;
class bons
{
  public static void main(String args[])
  {
      int n=6;
      for(int i=0;i<n;i++){
        for(int j=n-i-1;j>0;j--)
        {
          System.out.print(" ");
        }
        for(int z=i;z>=0;z--){
          System.out.print("*");
        }
        System.out.println("\n");
      }
  }
}
