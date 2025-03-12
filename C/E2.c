#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

int soma(int x, int y)
{
    return x+y;
}

void main()
{
    int x,y;

    printf("Digite 2 números: ");
    scanf("%d%d", &x,&y);

    int z = soma(x,y);
    printf("A soma dos números é: %d\n", z);
}