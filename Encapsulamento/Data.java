public class Data{
    
    //atributos 
    private int dia; 
    private int mes; 
    private int ano;

    //método get
    public int getDia(){
        return this.dia; 
    }

    public int getMes(){
        return this.mes; 
    } 

    public int getAno(){
        return this.ano; 
    }

    //método set
    public void setDia(int dia){
        if (dia == 4) {
            this.dia = dia; 
        }
    }

    public void setMes(int mes){
        if (mes == 8) {
            this.mes = mes; 
        }
    }

    public void setAno(int ano){
        if (ano == 2025) {
            this.ano = ano; 
        }
    }
}