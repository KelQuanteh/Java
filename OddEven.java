/* Construa um programa em Java que leia um número inteiro e diga se ele é par ou ímpar. */

import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num; 
        boolean even; 

        System.out.printf("Digite um numero: "); 
        num = input.nextInt(); 

        // odd/even check
        even = num % 2 == 0;

        System.out.printf("%s", even); 
    }
}