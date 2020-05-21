#include<iostream>
using namespace std;
int main()
{
    int n,i,j,k;
  
   
  std::cin>>n;
  int s=4;
    for(i=1;i<=s;i++)
    {
        for(k=1;k<=i;k++)
        {
            std::cout<<n;
        }
        n++;
        std::cout<<"\n";
    }
    n--;
    for(i=s;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
          std::cout<<n;
        }
        n--;
      std::cout<<"\n";
    }
    return 0;
}