package com.achais.basic;

/**
 * Character 类
 */
public class CharacterClass {
    public static void main(String[] args) {
        char ch = 'a';

        // Unicode 字符表示形式
        char uniChar = '\u039A';

        // 字符数组
        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        System.out.println(ch);
        System.out.println(uniChar);
        System.out.println(chars);

        Character character = new Character('a');
        System.out.println(character.charValue());
        System.out.println("访问\"起风博客!\"");

        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toString('c'));
    }
}
