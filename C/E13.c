#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int retorna_vogal(char p[])
{
    int i;
    int vogais = 0;

    for (i=0;i<strlen(p);i++)
    {
        if (p[i]=='a' || p[i]=='e' || p[i]=='i' || p[i]=='o' || p[i]=='u')
        {
            vogais++;
        }
    }

    return vogais;
}

int main()
{

    char p = "abacaxi";
    int x;

    int x = retorna_vogal(p);

    printf("A palavra %s tem %d vogais\n", p, x);
}