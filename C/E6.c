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
    srand(time(NULL));
    int x = rand()%10;

    //int x = 4;
    if (primo(x))
    {
        printf("O número %d é primo\n", x);
    }
    else
    {
        printf("O número %d não é primo\n", x);
    }
}