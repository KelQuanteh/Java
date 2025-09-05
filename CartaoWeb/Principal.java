
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CartaoWeb[] cartoes = new CartaoWeb[3]; 

        cartoes[0] = new CartaoDiaDosNamorados(); 
        cartoes[1] = new CartaoAniversario(); 
        cartoes[2] = new CartaoNatal(); 

        Scanner input = new Scanner(System.in);
        String name;  
        int num = 2; 

        while (num >= 0) { 
            System.out.println("Entre um nome: ");
            name = input.next(); 
            cartoes[num].retornarMensagem(name);  

            num --; 
        }
    }
}
