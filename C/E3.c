#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

int divisao(int x, int y)
{
    int div;

    div= x/y;
    if(!div)
    {
        return 0;
    }

    return div;

}

int main()
{
    int x,y;

    printf("Digite 2 números: ");
    scanf("%d%d", &x,&y);

    int z = divisao(x,y);
    printf("A divisão dos números é: %d\n", z);

}