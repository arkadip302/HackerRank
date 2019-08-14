#include<Stdio.h>
int main()
{
  int n,v;
  scanf("%d",&v);
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<n;i++){
    if(arr[i]==v)
    {
      printf("%d",i);
    }
  }
}
