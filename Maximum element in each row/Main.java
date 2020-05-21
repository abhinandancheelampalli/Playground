#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r;
  std::cin>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    int x=0;
    for(int j=0;j<c;j++)
    {
      if(a[i][j]>x)
        x=a[i][j];
    }
    std::cout<<x<<"\n";
  }
  return 0;
}
    
  