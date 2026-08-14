package day4;

import java.util.Scanner;

public class GaintWheel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int cabin = 91;cabin>=87;cabin--){
        System.out.println("New cabin arraived");
        for(int person=1;person<=4;){
            System.out.println("Let me know age");
            int age = scan.nextInt();
            //person(age>=18&&age<=60)?person+1:person;
            if (age>=18&&age<+60) {
                person++;
                System.out.println("enjoy the ride");
                
            }else
                System.out.println("Safety is prior over ride");
        }
        }
        scan.close();
    }
}
