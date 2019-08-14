import java.util.*;
class Solution{
  public static void main(String args[]){
      String s="RRRYYBYB";
      char schar[]=s.toCharArray();
      int count=0,z=s.length()-1,flag=0;
      //System.out.println("Starting "+s);
      int k=s.length();
      for(int i=0;i<=z;i++){
        if(schar[i]!='_'){
          for(int j=i+1;j<=z;j++){
            if(schar[i]==schar[j])
            {
              count++;
            }
            char ch=schar[i];
            schar[i]=schar[j];
            schar[j]=ch;
            System.out.println("Values "+schar[i]+" "+schar[j]+" "+count);
            System.out.println("ending of loop 1 s"+Arrays.toString(schar));
          }
          System.out.println("Values of count "+count);
          if(count==1){
            System.out.println("No");
            flag=1;
            break;
          }
          count=0;
        }
        else{
          char ch=schar[i];
            System.out.println(schar[z]);
          schar[i]=schar[z];
          schar[z]=ch;
            System.out.println("ending s"+Arrays.toString(schar));
          z--;
        }
     }
     if(flag!=1)
     System.out.println("YES");
  }
}
