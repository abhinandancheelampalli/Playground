#include<iostream>
using namespace std;
int main()
{
  int n,a[20],l,v,pos=0;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>l;
  if(l>n){
    std::cout<<"Invalid Input";
  }
  else{
  std::cout<<"Enter the value to insert\n";
  std::cin>>v;
  std::cout<<"Array after insertion is\n";
  while(pos!=l-1)
  {
    pos+=1;
  }

  for(int i=n;i>pos;i--)
  {
    a[i]=a[i-1];
   }
  a[pos]=v;
  for(int i=0;i<n+1;i++)
  {
    std::cout<<a[i]<<"\n";
  }
  }
    
  

  
  
  return 0;
}