package firstJavaPrograms;

import java.util.Scanner;

public class evenodd {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);  
        int num1;
        System.out.println("Enter 1st number");
        num1= sc.nextInt();
        if(num1%2==0){
            System.out.println("The Given Number is an Even umber");
        }
        else{
            System.out.println("The given number is an Odd number");
        }

    
    sc.close();
    }
    
    
}
