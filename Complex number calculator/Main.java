#include<iostream>
using namespace std;
int main()
{
  int i,a1,b1,a2,b2;
  std::cin>>i;
  std::cin>>a1;
  std::cin>>b1;
  std::cin>>a2;
  std::cin>>b2;
  if(i==1){
    std::cout<<(a1+a2)<<"+"<<(b1+b2)<<"i";
  }
  else if(i==2){
    std::cout<<(a1-a2)<<"+"<<(b1-b2)<<"i";
}
  else if(i==3){
    int x3 = a1 * a2 - b1 * b2;
  int  y3 = a1 * b2 + b1 * a2;
    std::cout<<x3<<y3<<"i";
}
  else{
    std::cout<<"Invalid choice";
  }
}

  
  