
import java.util.Scanner;

/* Crie um programa em Java que some os elementos de um array formado por cinco elementos do tipo inteiro. */

public class  SomaArray {
    public static void main(String[] args) {
        int inteiros[] = new int[5]; 

        Scanner input = new Scanner(System.in); 

        int soma = 0; 

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um numero: ");
            inteiros[i] = input.nextInt(); 
            
            soma += inteiros[i]; 
        }

        System.out.println("Soma: " + soma);
    }
}
