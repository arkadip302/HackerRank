import java.util.*;
class bird
{
  public static void main(String args[])
  {
    int max=1,curr=1,res=migbir[0];
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] migbir=new int[n];
    for(int i=0;i<n;i++)
    {
      migbir[i]=sc.nextInt();
    }
    Arrays.sort(migbir);
    for(int i=1;i<n;i++)
    {
      if(migbir[i]==migbir[i-1])
       curr++;
      else
      {
        if(curr>max)
        {
          max=curr;
          res=migbir[i-1];
        }
        curr=1;
      }
    }
    if (curr>max)
		{
			max=curr;
			res=migbir[n - 1];
		}
    System.out.println(res);
  }
}
