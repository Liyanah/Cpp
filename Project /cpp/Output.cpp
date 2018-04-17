#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <cilk/cilk.h>
#include <cilk/cilk_api.h>
#include <iostream>
int function(int m,int i){
m=i-1;
if(m<20)cilk_spawn function(m,i);
 m;
}
int main(int argc,char*argv[]){
int a=4.3;
int b=3/34;
int result=function(a,b);
cilk_sync
 return 0;
}
