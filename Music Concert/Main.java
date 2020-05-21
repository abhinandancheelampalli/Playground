#include<iostream>
using namespace std;
int main(){
  int a;
  int c1=0;
  int c2=0;
  std::cin>>a;
  int b[a];
  for(int i=0;i<a;i++)
  {
    std::cin>>b[i];
  }
  for(int i=0;i<a;i++)
  {
    if(b[i]%2==0)
    {
      c2+=1;
      
    }
    else{
      c1+=1;
    }
    
  }
  std::cout<<c1<<"\n";
  std::cout<<c2;
  return 0;
}