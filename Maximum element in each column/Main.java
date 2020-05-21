#include <bits/stdc++.h> 
using namespace std; 
void largestInColumn() 
{ 
  int rows,cols;
  cin>>rows;
  cin>>cols;
  int mat[rows][cols];
  for(int i=0;i<rows;i++)
  {
    for(int j=0;j<cols;j++)
    {
      cin>>mat[i][j];
      
    }
  }
    for (int i = 0; i < cols; i++) { 
        int maxm = mat[0][i];
        for (int j = 1; j < rows; j++){
            if (mat[j][i] > maxm) 
                maxm = mat[j][i]; 
        } 
          cout << maxm <<endl; 
    } 
} 
  
int main() 
{  
    largestInColumn(); 
    return 0; 
}