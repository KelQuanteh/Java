public class Principal{
    public static void main(String[ ] args) {
        
        Funcionario objeto1 = new Funcionario( );
        Funcionario objeto2 = new Funcionario( );
        objeto1.cadastrar("Kelvin", 28, 1200);
        objeto1.exibirDados( );
        objeto2.cadastrar("Sabrina", 25, 2000);
        objeto2.exibirDados();
        
    }
}