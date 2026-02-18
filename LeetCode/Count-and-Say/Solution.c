1
2char* countAndSay(int n) {
3    if (n == 1) {
4        char* base = (char*)malloc(2);
5        strcpy(base, "1");
6        return base;
7    }
8
9    char* prev = countAndSay(n - 1);
10    int len = strlen(prev);
11    char* result = (char*)malloc(len * 2 + 1); 
12    int resIndex = 0;
13
14    for (int i = 0; i < len;) {
15        char currentChar = prev[i];
16        int count = 0;
17        while (i < len && prev[i] == currentChar) {
18            count++;
19            i++;
20        }
21        
22        result[resIndex++] = count + '0';
23        
24        result[resIndex++] = currentChar;
25    }
26
27    result[resIndex] = '\0'; 
28    free(prev); 
29    return result;
30}