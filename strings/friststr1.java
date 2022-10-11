package strings;

import java.util.Scanner;

public class friststr1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectLiteral1 = new String("xyz");
        String ObjectLiteral2 = new String("xyz");

        System.out.println(literalString1 == literalString2);

        System.out.println((objectLiteral1 == ObjectLiteral2));


    }
    
}
