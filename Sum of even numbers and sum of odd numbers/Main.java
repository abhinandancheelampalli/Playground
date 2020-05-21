#include<iostream>
using namespace std;
int main()
{
  int n;
  int s1=0;
  int s2=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
 
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      s1+=a[i];
    }
    else
    {
      s2+=a[i];
    }
  }
  std::cout<<"The sum of the even numbers in the array is "<<s1<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<s2;
return 0;
}