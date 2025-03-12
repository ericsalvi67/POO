#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

int primo(int x)
{
    int i;

    for (i=2;i<=x/2;i++)
    {
        if(x%i==0)
        {
            return 0;
        }
    }

    return 1;
}

int main()
{
    int x, y;
    int i;

    do
    {
        printf("Digite um número inicial: ");
        scanf("%d", &x);
        printf("Digite um número final: ");
        scanf("%d", &y);
    } while (y<=x);

    for (i=x;i<=y;i++)
    {
        if (primo(i))
        {
            printf("O número %d é primo\n", i);
        }
        else
        {
            printf("O número %d não é primo\n", i);
        }
    }
}