#include<iostream>
using namespace std;
int main()
{
 int X,R,Y;
  float interest,amount,discount,finalsettlement;
  std::cin>>X;
  std::cin>>R;
  std::cin>>Y;
  interest=(X*R*Y)/100;
  amount=X+interest;
  discount=2*interest/100;
  finalsettlement=amount-discount;
  std::cout<<""<<interest<<"\n";
  std::cout<<""<<amount<<"\n";
  std::cout<<""<<discount<<"\n";
  std::cout<<""<<finalsettlement;
  return 0;
}