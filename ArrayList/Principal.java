
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Kelvin", "kkq20@inf.ufpr.br"); 

        List<Pessoa> lista = new ArrayList<Pessoa>(); 

        lista.add(p); 

        int tamanho = lista.size(); 
        
        System.out.println("O tamanho da lista de pessoas é: "+ tamanho);
        
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.nome);
        }

        lista.remove(0); 

        tamanho = lista.size();

        System.out.println("Agora o tamanho é: "+ tamanho);
    }
}
