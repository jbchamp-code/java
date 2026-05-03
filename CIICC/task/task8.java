package CIICC.task;

public class task8 {
    public int printAccumulativeNumber(int... numbers){
        int total = 0;
        for (int number : numbers) {
            int subtotal = 0;
            for(int i = 1;i<=number;i++)
                subtotal += i;
            
            total += subtotal;
        }
        return total;
    }
}
