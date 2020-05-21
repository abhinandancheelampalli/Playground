#include <bits/stdc++.h> 
  

using namespace std; 
  
// Returns true if mat[][] is magic 
// square, else returns false. 
bool isMagicSquare() 
{  
  int N;
  cin>>N;
  int mat[N][N];
  for(int i=0;i<N;i++)
  {
    for(int j=0;j<N;j++)
    {
      cin>>mat[i][j];
    }
  }
    // calculate the sum of  
    // the prime diagonal 
    int sum = 0,sum2=0;  
    for (int i = 0; i < N; i++) 
        sum = sum + mat[i][i]; 
    // the secondary diagonal 
    for (int i = 0; i < N; i++) 
        sum2 = sum2 + mat[i][N-1-i]; 
  
    if(sum!=sum2)  
        return false; 
  
    // For sums of Rows  
    for (int i = 0; i < N; i++) { 
          
        int rowSum = 0;      
        for (int j = 0; j < N; j++) 
            rowSum += mat[i][j]; 
          
        // check if every row sum is 
        // equal to prime diagonal sum 
        if (rowSum != sum) 
            return false; 
    } 
  
    // For sums of Columns 
    for (int i = 0; i < N; i++) { 
          
        int colSum = 0;      
        for (int j = 0; j < N; j++) 
            colSum += mat[j][i]; 
  
        // check if every column sum is  
        // equal to prime diagonal sum 
        if (sum != colSum)  
        return false; 
    } 
  
    return true; 
} 
  
// driver program to  
// test above function 
int main() 
{
    if (isMagicSquare()) 
        cout << "Yes"; 
    else
        cout << "No"; 
      
    return 0; 
} 