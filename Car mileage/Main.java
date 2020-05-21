#include<iostream>
int main()
{
float m,x;
  int l,d;
  std::cin>>m;
  std::cin>>l;
  std::cin>>d;
  if(d>(l*m))
  {
  	std::cout<<"Cannot reach";
  }
  else if(d<(l*m))
  {
  	std::cout<<"Can reach";
  }

  return 0;
}