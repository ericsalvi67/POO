#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int retorna_vogal(char *p)
{
    int i;
    int t = strlen(p);
    int vogais = 0;

    for (i=0;i<t;i++)
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
    char str[] = "abacaxi";
    int x = retorna_vogal(str);

    printf("A palavra %s tem %d vogais\n", str, x);
}