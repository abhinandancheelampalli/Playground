#include<iostream>
using namespace std;
int main(){
int n,num=1,i=1,space=0,k=1;
std::cin>>n;
int number=n;
for(i=0;i<n;i++)
{
for(int j=1;j<=space;j++)
{

std::cout<<"-";

}
for(int m=1;m<2*n-space;m++)
{
if(m%2==0)
std::cout<<"*";
else
std::cout<<num++;
}
std::cout<<"*";
for(int l=1;l<2*n-space;l++)
{
if(l%2==0)
std::cout<<"*";
else
{
std::cout<<k+number*number;
k++;
}
}
number--;


space=space+2;
std::cout<<"\n";
}
return 0;
}