#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  int temp;
  temp=a;
  a=b;
  b=temp;
 

  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}

