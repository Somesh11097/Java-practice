package firstJavaPrograms;
import java.util.Scanner;

import javafx.scene.effect.Light.Spot;

public class greetings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a greeting msg");
        String str = sc.nextLine(); //reads strings
        System.out.println("Welcome to the bootcamp " +str);

    }
    
}
