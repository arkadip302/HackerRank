#include<stdio.h>
#include<string.h>
int main() {
    int hour,min,sec ;
    char ch[3];
    scanf("%d:%d:%d%s",&hour,&min,&sec,ch);
    if (strcmp(ch,"PM")==0 && hour!=12) hour += 12 ;
    if (strcmp(ch,"AM")==0 && hour==12) hour = 0 ;
    printf("%02d:%02d:%02d",hour,min,sec);
    return 0;
}
