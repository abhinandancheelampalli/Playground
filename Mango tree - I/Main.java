#include<iostream>

using namespace std;

int main()

{

int a,b,c;
std::cin>>a>>b>>c;
if(c>1 && c<b)  
for(int i=2;i<b;i++){
  if(i==c)
    std::cout<<"Yes";
}
else if(c%b==0 || c%b==1)

std::cout<<"Yes";

else

std::cout<<"No";

}
