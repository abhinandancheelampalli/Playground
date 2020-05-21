#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[100];
    int count = 0, i; 
    gets(str);
    for (i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
  if(count>10)
  {
    std::cout<<"Caption not eligible for the contest";
  }
  else
  {
    std::cout<<"Caption eligible for the contest";
  }
    return 0;
}