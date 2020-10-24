#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
    
    int N;
    scanf("%i", &N);

    for(int caso = 0; caso < N; caso++){
        int d1, d2;

        scanf("%i %i", &d1, &d2);

        if(d1 > d2){
            int temp = d1;
            d1 = d2;
            d2 = temp;
        }

        int a;
        for(a=0; a < d2-d1; a++) printf("%i ", d1 + a+1); 
        printf("%i", d1 + a+1);

        printf("\n");
    }

    return(0);
}
