package CIICC.task;

import java.util.Scanner;


public class task5 {
    public void printingLargestNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 3 numbers.");
        long numb1 = input.nextLong();
        long numb2 = input.nextLong();
        long numb3 = input.nextLong();

        if (numb1==numb2 && numb1==numb3) 
            System.out.println("The largest number is " + numb1 + "\nInputed numbers:"+ numb1 + ", " + numb2 + ", " + numb3);
        else
            System.out.println("The largest number is " + ((numb1 > numb2)? (numb1 > numb3) ? numb1: numb3 : (numb2 > numb3) ? numb2: numb3));
    }
}
