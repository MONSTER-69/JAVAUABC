package boleto;

public class ValidarTiempo {

    private int hora;
    private int minuto;
    private int segundo;

    //metodo contructor 

    public ValidarTiempo(){

        this.hora=0;
        this.minuto=0;
        this.segundo=0;

    }

    //metodos set y gets para caca atributo

    void setHora(int hora){

        this.hora=hora;

    }

    public int getHora(){

        return hora;
    }

    void setMinuto(int minuto){

        this.minuto=minuto;
    }

    public int getMinuto(){

        return minuto;
    }

    public void setSegundo(int segundo){

        this.segundo=segundo;
    }

    public int getSegundo(){

        return segundo;
    }

    
}
