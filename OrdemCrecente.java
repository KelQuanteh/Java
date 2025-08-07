
import java.util.Scanner;

/* Escreva um programa em Java que leia dois números digitados pelo usuário. Em seguida, imprima os
números em ordem crescente. */

public class OrdemCrecente{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int a; 
        int b; 

        System.out.printf("Digite o primeiro numero: ");
        a = input.nextInt(); 

        System.out.printf("Digite o segundo numero: ");
        b = input.nextInt(); 

        if (a > b) {
            System.out.printf("%d, %d \n", a, b);
        } else {
            System.out.printf("%d, %d \n", b, a);
        }
    }
}