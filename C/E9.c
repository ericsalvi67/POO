#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>


float Converte_temperatura(int c)
{
    return c*1.8+32;
}

int main()
{
    int c;

    printf("Digite a temperatura em Celsius: ");
    scanf("%d", &c);

    float f =Converte_temperatura(c);

    printf("A temperatura em Fahrenheit é: %.1f graus.\n", f);
}