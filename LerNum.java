/* Escreva um programa m Java para ler um número inteiro digitado pelo usuário. Em seguida,
exiba o número na tela. */


import java.util.Scanner;

public class LerNum{
    // main code
    public static void main(String[] args) {
        
        //Scanner to read inputs 
        Scanner input = new Scanner(System.in); 

        //integer declaration 
        int num; 

        System.out.println("Digite um número: ");

        num = input.nextInt(); 

        System.out.printf("Número digitado: %d \n", num); 

    }
}