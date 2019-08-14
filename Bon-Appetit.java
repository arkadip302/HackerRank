import java.util.*;
import java.io.*;
class bon
{

  public static void main(String args[])
  {
    int count=0;
    int arr[]=new int[]{1,2,3,4,3,3,2,1};
     List<Integer> intList = new ArrayList<Integer>();
     for(int i=0;i<arr.length;i++){
       intList.add(arr[i]);
     }
     int n=intList.size();
     while(intList.size()>1){
       Collections.sort(intList);
       for(int i=0;i<intList.size();i++){
          if(intList.get(0)<=0){
            count++;
            intList.remove(0);
          }
        }
        int small=intList.get(0);
        for(int i=0;i<intList.size();i++){
           if(intList.get(i)>0){
             intList.set(i,intList.get(i)-small);
           }
         }
          System.out.println(Integer.toString(n-count));
     }
    }
  }
