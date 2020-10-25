#include <iostream>
#include <math.h>
#include <string.h>

using namespace std;

int main(){
    
    int N, I;
    bool fin = false;
    while(!fin){
        cin >> N >> I;

        if(N == 0 && I == 0) fin = true;
        else{
            int c1, c2;
            while(cin >> c1 >> c2 && c1 != 0 && c2 != 0)
            {
                if(c1 == I) I = c2;
                else if (c2 == I) I = c1;
            }
            cout<<I<<endl;
        }
    }
    
    return(0);
}

