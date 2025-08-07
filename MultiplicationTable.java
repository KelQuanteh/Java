import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        int num, mult;
        
        System.out.println("Digite um numero: ");
        num = teclado.nextInt();

        for (int i = 2; i <= 10; i++) {
            mult = num * i; 
            System.out.printf("%d \n", mult); 
        }
    }
}