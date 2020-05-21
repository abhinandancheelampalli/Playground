#include<iostream>
using namespace std;
int main()
{
  int s1;
  int p1;
  std::cin>>s1;
  std::cin>>p1;
  int a[s1][p1];
  for(int i=0;i<s1;i++)
  {
    for(int j=0;j<p1;j++){
      std::cin>>a[i][j];
    }
    
  }
  for(int i=0;i<p1;i++)
  {
    for(int j=0;j<s1;j++)
    {
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<"\n";
  }
  return 0;
}
  