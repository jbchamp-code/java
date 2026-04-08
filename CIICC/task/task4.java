package CIICC.task;

import java.util.Scanner;

public class task4{
    public void palindrome(){
        Scanner input = new Scanner(System.in);
        System.out.println("input a palindrome word:");
        String s = input.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String half = sb.substring(0,  (sb.length() % 2 != 0) ? (sb.length() / 2) + 1 : sb.length() / 2);
        sb.reverse();
        String half2 = sb.substring(0,  (sb.length() % 2 != 0) ? (sb.length() / 2) + 1 : sb.length() / 2);
        if(half.equalsIgnoreCase(half2))
            System.out.println("The input string is a palindrome");
        else
            System.out.println("The input string is not a palindrome");
        }
}