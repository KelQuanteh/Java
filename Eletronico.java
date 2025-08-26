public class Eletronico{

    //atributos 
    private int ano; 
    private double  tamanho; // em metros 
    private long  custo; 
    private String cor; 
    private float  peso; 

    //construtores
    public Eletronico(int ano){
        this.ano = ano; 
    };

    public Eletronico(double tamanho){
        this.tamanho = tamanho; 
    }; 

    public Eletronico(long custo){
        this.custo = custo; 
    }

    public Eletronico(String cor){
        this.cor = cor; 
    }

    public Eletronico(float peso){
        this.peso = peso; 
    }

    public static void main(String[] args) {
        
        String color = "blue"; 

        Eletronico obj1 = new Eletronico(color);

        System.out.println(obj1.cor);  
    }

}