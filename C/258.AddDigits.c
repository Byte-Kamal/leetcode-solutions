


#include <stdio.h>

int addDigits(int num) {
    if (num < 10){
        return num;
    }else{
        return addDigits((num / 10) + (num % 10));
    }
}

int main() {
    int result = addDigits(38);
    printf("%d", result);
    
    return 0;
}
