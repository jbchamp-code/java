package CIICC.task;

import static java.lang.Math.*;

public class task9 {
    public int add(int n1, int n2){
        System.out.println("Addition: " + n1 + " + " + n2 + " = ");
    
        return addExact(n1, n2);
    }
    public int subtract(int n1, int n2){
        System.out.println("Subtraction: " + n1 + " - " + n2 + " = ");
        
        return subtractExact(n1, n2);
    }
    public int multiply(int n1, int n2){
        System.out.println("Multiplication: " + n1 + " * " + n2 + " = ");
        
        return multiplyExact(n1, n2);
    }
    public int divide(int n1, int n2){
        System.out.println("Division (floor): " + n1 + " / " + n2 + " = ");
        return floorDiv(n1, n2);
    }
        
}
