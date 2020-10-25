#include <bits/stdc++.h> 
#include <sstream>
#include <string>
#include <queue>
using namespace std; 
  
int minSum(int arr[], int n, int k) 
{ 
    int min_Sum = INT_MAX; 
  
    for (int i = 0; i < n - k + 1; i++) { 
        int current_sum = 0; 
        for (int j = 0; j < k; j++) 
            current_sum = current_sum + arr[i + j]; 
  
        min_Sum = min(min_Sum, current_sum); 
    } 
  
    return min_Sum; 
} 
int main() 
{ 
    string res, aux;
    queue<string> q;
    
    getline(cin, res);
    istringstream isstream(res);

    while(isstream >> aux) {
        q.push(aux);
    }

    int arr[q.size()-1];
    for(int a = 0; !q.empty(); a++){
        arr[a] = stoi(q.front(), nullptr, 10);
        q.pop();
    }

    

    int budget; 
    cin >> budget;
    int n = sizeof(arr) / sizeof(arr[0]);

    int i;
    for(i = 1; minSum(arr, n, i) <= budget; i++){ }
    cout << i -1; 
    return 0; 
} 
