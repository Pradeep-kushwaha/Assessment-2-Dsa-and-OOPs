import java.util.Scanner;

public class Q1_Primefact {
    public static void main(String[] args) {
        int number;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = scn.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}