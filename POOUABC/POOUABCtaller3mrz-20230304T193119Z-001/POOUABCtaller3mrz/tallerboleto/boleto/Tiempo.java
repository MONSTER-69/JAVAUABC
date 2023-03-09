package boleto;

public class Tiempo {
    //atributos 
    private int hora;
    private int minuto;
    private int segundo;

    //metodo contructor 

    private Tiempo(){

        this.hora=0;
        this.minuto=0;
        this.segundo=0;

    }

    //metodos set y gets para caca atributo

    private void setHora(int hora){

        this.hora=hora;

    }

    private int getHora(){

        return hora;
    }

    private void setMinuto(int minuto){

        this.minuto=minuto;
    }

    private int getMinuto(){

        return minuto;
    }

    private void setSegundo(int segundo){

        this.segundo=segundo;
    }

    private int getSegundo(){

        return segundo;
    }

    public static void main(String[] args){


        Tiempo tiempo =new Tiempo();
   
        System.out.println("la hora de entrada es de: "+tiempo.hora+":"+tiempo.minuto+":"+tiempo.segundo);

        

}
