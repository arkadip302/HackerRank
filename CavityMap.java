import java.util.*;
class Solution{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String arr[]=new String[n];
    for(int i=0;i<n;i++){
    arr[i]=sc.nextLine();
    }
    for(int i=1;i<n-1;i++){
      for(int j=1;j<n-1;j++){
        //System.out.print(Character.getNumericValue(arr[i].charAt(j))+" "+Character.getNumericValue(arr[i-1].charAt(j))+" "+Character.getNumericValue(arr[i].charAt(j-1)));
        if(Character.getNumericValue(arr[i].charAt(j))>Character.getNumericValue(arr[i-1].charAt(j)) && Character.getNumericValue(arr[i].charAt(j))>Character.getNumericValue(arr[i].charAt(j-1))
         && Character.getNumericValue(arr[i].charAt(j))>Character.getNumericValue(arr[i].charAt(j+1)) && Character.getNumericValue(arr[i].charAt(j))>Character.getNumericValue(arr[i+1].charAt(j)))
        arr[i]=arr[i].substring(0,j)+"X"+arr[i].substring(j+1);
      }
    }
    for(int i=0;i<n;i++)
    System.out.println(arr[i]);
  }
}
