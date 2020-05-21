#include <iostream>
int main()
{
 int A[10][10],i,j,r[10],c[10],row,col;
 int max=0,k;
  int max2=0,k1;

// Input of no of rows and columns
std::cin >> row;
std::cin>>col;
std::cout<<"Sum of rows is";
// Input of matrix
 for( i=0; i<row; i++ )
 { for ( j=0; j<col; j++ )
   std::cin >> A[i][j];
 }



// Loop for Row Sum 
for( i=0; i<row; i++ )
{
 r[i]=0;


 for( j=0; j<col; j++ ){
 r[i] = r[i] + A[i][j];
   if(r[i]>max){
     max=r[i];
     k=i;
   }
 }
  std::cout<<" "<<r[i];
}
  std::cout<<"\nRow "<<k+1<<" has maximum sum";

// Loop for Column sum 
  std::cout<<"\n"<<"Sum of columns is";
for ( j=0; j<col; j++ )
{
 c[j]=0;
 for ( i=0; i<row; i++ ){
 c[j] = c[j] + A[i][j];
   if(c[j]>max2)
   {
     max2=c[j];
     k1=j;
   }
}
  std::cout<<" "<<c[j];
}
   std::cout<<"\nColumn "<<k1+1<<" has maximum sum";

} 