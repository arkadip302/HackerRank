import java.util.*;
class a{
  public static void main(String args[]){
    String s="chillout",res="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)==' '){
        s=s.replace(" ","");
      }
    }
    int n=s.length();
    double num=Math.sqrt((double)n);
    int col=(int)Math.ceil(num);
    int row=(int)Math.floor(num);
    System.out.println(s +" "+num+" "+col+" "+row);
    /*for(int i=0;i<col;i++){
      for(int j=0;j<row;j++){
          System.out.print(s.charAt(i));
          System.out.println(s.charAt(j));
      }
    }*/
    for(int j=0;j<col;++j) {
        for(int i=j; i<n;i+=col) res=res+s.charAt(i);
        res=res+' ';
    }
    System.out.println(res);
}
}
