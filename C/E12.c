#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

#define t 10

void gera_vet(int v[t])
{
    srand(time(NULL));
    int i;

    for (i=0;i<t;i++)
    {
        v[i] = rand() % 100;
        printf("v[%d] = %d\n", i, v[i]);
    }
}

int maior_valor(int v[t])
{
    int i;
    int maior = v[0];

    for (i=1;i<t;i++)
    {
        if (v[i]>maior)
        {
            maior = v[i];
        }
    }

    return maior;
}

int main()
{
    int v[t];

    gera_vet(v);

    int x = maior_valor(v);

    printf("O maior valor do vetor é: %d\n", x);
}