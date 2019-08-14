#include<stdio.h>
int main()
{
  int a[3],b[3],af=0,bf=0;
  for(int i=0;i<3;i++)
  scanf("%d",&a[i]);
  for(int i=0;i<3;i++)
  scanf("%d",&b[i]);
  for(int i=0;i<3;i++)
  {
    if(a[i]>b[i])
    af++;
    else if(a[i]<b[i])
    bf++;
  }
  printf("%d %d",af,bf);
}
