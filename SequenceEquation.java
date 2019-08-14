import java.util.*;
class Solution{
  public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int p[]=new int[]{4,3,5,1,2};
      int z=0;
      List<Integer> num_list=new ArrayList<Integer>();
      num_list.add(0);
      for(int i=0;i<p.length;i++){
          num_list.add(i+1,p[i]);
      }
    System.out.println(Arrays.toString(num_list.toArray()));
      for(int i=1;i<=num_list.size()-1;i++){
        for(int j=1;j<=num_list.size()-1;j++){
            if(num_list.get(num_list.get(num_list.get(j)))==i){
            p[z]=num_list.get(j);
            z++;
          }
      }
    }
    for(int i=0;i<z;i++){
      System.out.println(p[i]);
    }
  }
}
