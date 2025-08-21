public class Contador{
    //atributos
    private int cont; 

    //métodos
    public int getCont(){
        return this.cont;
    }

    public void setCont(int val){
        this.cont += val; 
    }

    public void setZeraCont(){
        this.cont = 0;  
    }

    public void setIncrementaCont(){
        this.cont += 1; 
    }

    public void setDecrementaCont(){
        if (this.cont > 0)
            this.cont -= 1;         
    }
}