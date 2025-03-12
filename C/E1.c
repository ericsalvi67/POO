#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>


int par_ou_impar(int x)
{
    return x%2;
}

int main()
{
    srand(time(NULL));
    int x = rand() % 100;
    
    par_ou_impar(x);
 
    if (x)
    {
        printf("O número %d é par\n", x);
    }
    else
    {
        printf("O número %d é ímpar\n", x);
    }
    
}