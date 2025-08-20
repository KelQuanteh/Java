public class PrincipalData{
    public static void main(String[] args) {
        
        //cria 2 objetos
        Data obj1 = new Data();
        Data obj2 = new Data(); 

        //initialize os campos
        obj1.setDia(4);
        obj1.setMes(8);
        obj1.setAno(2025);

        if (obj1.getAno() == 2025 && obj1.getMes() == 8 && obj1.getDia() == 4)
            System.out.println(obj1.getDia() + "/"+obj1.getMes()+"/"+obj1.getAno());
        else 
            System.err.println("Data Errado");
        
    }
}