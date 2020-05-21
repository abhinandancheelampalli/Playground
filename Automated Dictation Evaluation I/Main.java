#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char str1[100];char str2[100];
    int i=0; 
   
    std::cin>>str1;
    std::cin>>str2;
    i=strcmp(str1,str2);    
    if(i==0)
    std::cout<<"It is correct";
    else
    std::cout<<"It is wrong";
    //printf("\nThe number of letters in the name is %d",l);
    return 0;
}