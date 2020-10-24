#include <iostream>
#include <math.h>
#include <list>
#include <iterator>

using namespace std;

int func(int n, list<int> x){
    int cache[n+1] = {};
    cache[0] = 1;
    list<int> :: iterator aux;

    for(int i = 0; i < n + 1; i++){
        for(aux = x.begin(); aux != x.end(); ++aux){
            
            if(i - *aux >= 0){
                cache[i] += cache[i - *aux];
            }
        }
    }

    return cache[n];
}

int main(){
    
    int N;
    cin >> N;
    
    list<int> x;

    int res;
    while(cin >> res) { 
        x.push_back(res); 
    }

    cout << func(N, x);

    return(0);
}

