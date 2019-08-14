#include<stdio.h>
#include<stdlib.h>
int main()
{
  long signed int n,d;
  scanf("%ld",&n);
  scanf("%ld",&d);
  long signed int arr[n];
  for(long signed int i=0;i<n;i++)
  {
    scanf("%ld",&arr[i]);
  }
  while(d>0){
  int temp=arr[0];
  for(int i=1;i<n;i++)
  {
    arr[i-1]=arr[i];
  }
  arr[n-1]=temp;
  d--;
}
for(long signed int i=0;i<n;i++)
 {
     printf("%ld ",arr[i]);
 }
}
