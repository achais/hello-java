package com.achais.basic;

/**
 * 循环结构
 */
public class Loop {
    public static void main(String[] args) {
        // while 循环
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // do...while 循环
        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while (j < 5);

        // for 循环
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        // 增强 for 循环
        char[] numbers = {'a', 'b', 'c', 'd', 'e'};
        for (char number: numbers) {
            if (number == 'd') break;
            System.out.println(number);
        }
    }
}
