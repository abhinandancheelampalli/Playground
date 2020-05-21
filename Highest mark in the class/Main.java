#include<iostream>
using namespace std;
int main()
{
  int size;
  std::cin>>size;
  int a[size];
  for(int i=0;i<size;i++)
  {
    std::cin>>a[i];
  }
  int max=a[0];
  for(int i=1;i<size;i++)
  {
    if(a[i]>max){
      max=a[i];
    }
  }
  std::cout<<max;
}