#include<iostream>
 
using namespace std;
 
int main()
{
    int a[10][10],big1=0,n,m,i,j;
    cin>>m>>n;
 
    for(i=0;i<m;i++){
        for(j=0;j<n;++j){
            cin>>a[i][j];
        }
    }
 
    for(i=0;i<m;++i){
        for(j=0;j<n;++j)
        {
            if(a[i][j]>big1)
                big1=a[i][j];
        }
    }
    cout<<"The maximum element is "<<big1; 
    return 0;
}