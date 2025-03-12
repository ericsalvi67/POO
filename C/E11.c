#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

void troca_num(int *x, int *y)
{
    int aux;

    aux = *x;
    *x = *y;
    *y = aux;
}

int main()
{
    int x,y;

    printf("Digite 2 numeros inteiros: ");
    scanf("%d %d", &x, &y);


    printf("Os numeros digitados sao: X:%d Y:%d\n", x, y);
    troca_num(&x,&y);
    printf("Os numeros trocados sao: X:%d Y:%d\n", x, y);
}