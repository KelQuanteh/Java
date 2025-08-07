
import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num, sum; 

        System.out.println("Digite numeros e termine com -1: ");

        num = input.nextInt(); 
        sum = 0; 

        while (num != -1) { 
            sum = sum + num; 
            num = input.nextInt(); 
        }

        System.out.printf("%d \n", sum); 
    }
}