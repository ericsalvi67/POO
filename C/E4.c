#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

int escolhe_figura()
{
    int fig;

    printf("Qual a figura que deseja calcular a área?\n");
    printf("1 - Quadrado\n");
    printf("2 - Triângulo\n");
    printf("3 - Círculo\n");
    scanf("%d", &fig);

    return fig;
}

float calcula_figura(int fig)
{
    float a, b;
    float area=0;

    switch (fig)
    {
    case 1:
        printf("Digite o lado do quadrado: ");
        scanf("%f", &a);
        area = a * a;
        return area;
    
    case 2:
        printf("Digite a base do triângulo: ");
        scanf("%f", &a);
        printf("Digite a altura do triângulo: ");
        scanf("%f", &b);
        area = (a * b) / 2;
        return area;

    case 3:
        printf("Digite o raio do círculo: ");
        scanf("%f", &a);
        area = ((a * a) * 3.14) ;
        return area;    
    }
}


int main()
{
    int f;
    float a=0;

    f = escolhe_figura();
    a = calcula_figura(f);

    switch (f)
    {
    case 1:
        printf("A área do quadrado é: %.2fM2\n", a);
        break;
    
    case 2:
        printf("A área do triângulo é: %.2fM2\n", a);
        break;
    
    case 3:
        printf("A área do círculo é: %.2fM2\n", a);
        break;
    }
}