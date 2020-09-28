#include<stdio.h>
#include<string.h>

int main()
{
char a[5];
//strcpy(a,"按");

//0xB0B4  0xB0B5
a[0] = 0xB0;
a[1] = 0xB4;
a[2] = 0xB0;
a[3] = 0xB5;
a[4] = 0;
//printf("%XH %XH\n",(unsigned char)a[0],(unsigned char)a[1]);
printf("%s\n",a);
return 0;
}