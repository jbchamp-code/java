package CIICC.task;

import java.util.Scanner;

public class task7 {
    
    public void printUse4TypesOFArithmetic(){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please Enter 2 numbers:");
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();
        
        System.out.println(addNumbers(numb1,numb2));
        System.out.println(subtractNumbers(numb1, numb2));
        System.out.println(multiplyNumbers(numb1, numb2));
        System.out.println(dividNumbers(numb1, numb2));

    }
    int addNumbers(int number1, int number2){
        return number1 + number2;
    }
    int subtractNumbers(int number1, int number2){
        return number1 - number2;
    }
    int multiplyNumbers(int number1, int number2){
        return number1 * number2;
    }
    int dividNumbers(int number1, int number2){
        return number1 / number2;
    }
    
}
