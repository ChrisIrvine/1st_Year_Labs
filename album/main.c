/*
 * Program to read a .txt file and output various lines/combinations.
 */

/* 
 * File:   main.c
 * Author: ruw12gbu
 *
 * Created on 13 October 2016, 14:54
 * 
 * v1.0 - 13/10/2016
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
 * 
 */
int main(int argc, char** argv) 
{
    FILE*input = fopen("albums.txt", "r");
    
    if(input == NULL)
    {
        printf("Error: unable to open 'albums.txt' in mode 'r'\n");
        
        exit(EXIT_FAILURE);
    }
    
    char line[256];

    char *search = "Pink Floyd";
    char *songSearch = "-";
    FILE*output = fopen("pink_floyd.txt", "w");
    
    int foundPinkFloyd = 0;
    int totalLength = 0;
    
    while (fgets(line, 256, input))
    {
        char * charKey = strstr(line, search);
        
        char * songFinder = strstr(line, songSearch);
        if(songFinder && foundPinkFloyd == 1)
        {
            printf("%s", line);
        }
        else
        {
            foundPinkFloyd = 0;
        }
        
        if(charKey){
            printf("%s", charKey);
            fputs(charKey, output);
            foundPinkFloyd = 1;
        }
    }
    
    
        
    return (EXIT_SUCCESS);
}

