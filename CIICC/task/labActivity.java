package CIICC.task;

import java.util.Scanner;

public class labActivity {
    public void highestnumb(){
        Scanner scanner = new Scanner(System.in);
        
        //while(true){
            
            System.out.println("Enter First number:");
            int numb1 = scanner.nextInt();
            System.out.println("Enter Second number:");
            int numb2 = scanner.nextInt();
            System.out.println("Enter Third number:");
            int numb3 = scanner.nextInt();
            
            if(numb1==numb2 && numb2==numb3)
                System.out.println("Three input numbers are equal");
            else if(numb1>=numb2 && numb2>=numb3)
                System.out.println("Highest number:"+numb1);
            else if(numb2>=numb1 && numb2>=numb3)
                System.out.println("Highest number:"+numb2);
            else
                System.out.println("Highest number:"+numb3);


        /** 
            *System.out.println("Try again? Y/N");
            *String ans = scanner.nextLine();
            *if(ans == "Y" || ans == "y")
            *    continue;
            *else if((ans == "N" || ans == "n") != true)
            *    System.out.println("BB");
            *    System.out.println(ans);
                
            *    break;
            */
        }        

    }
}
