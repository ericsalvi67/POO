#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

int calcula_fatorial(int fat)
{
    int i;
    int soma=1;

    for (i= 1; i <= fat ; i++)
    {
        soma = soma * i;
    }

    return soma;

}

int main()
{
    int fat;
    int x;

    printf("Digite um número para calcular o fatorial: ");
    scanf("%d", &fat);

    x = calcula_fatorial(fat);

    printf("O fatorial de %d é: %d\n", fat, x);

}