#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

#define t 2

void gera_vet(int v[t])
{
    int i;

    for (i=0;i<t;i++)
    {
        v[i] = rand() % 10;
        printf("v[%d] = %d\n", i, v[i]);
    }
}

int mostra_vet_somado(int v[t])
{
    int i;
    int soma = 0;

    for (i=0;i<t;i++)
    {
        soma += v[i];
    }

    return soma;
}

int main()
{
    srand(time(NULL));
    int v[t];
    int soma;

    gera_vet(v);
    soma = mostra_vet_somado(v);

    printf("A soma dos elementos do vetor é: %d\n", soma);
}