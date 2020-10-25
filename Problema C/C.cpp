#include <iostream>
#include <math.h>
#include <string.h>

using namespace std;

string desincrypter(int k, string m){
    char ch;
    string d = "";
    for(int i = 0; i < m.length(); i++){
        ch = m.at(i);
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - k);
            
            if(ch < 'a'){
                ch = (char)(ch + 'z' - 'a' + 1);
            }
            
            d += ch;
        }
        else if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch - k);
            
            if(ch < 'A'){
                ch = (char)(ch + 'Z' - 'A' + 1);
            }
            
            d += ch;
        }
        else {
            d += ch;
        }
    }

    return d;
}

int main(){
    
    int N;
    cin >> N;

    string res, aux;
    cin >> res;
    while(cin >> aux) { 
        res += " " + aux;
    }
    cout<<desincrypter(N, res);
    return(0);
}

