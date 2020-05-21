#include<iostream>
int main()
{
 int a=0,b=1,c;
  int n;
  std::cin>>n;
  for(int i=0;i<(n-2);i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<c;
}