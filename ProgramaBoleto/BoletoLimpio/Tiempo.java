


public class Tiempo {
    //atributos 
    private int hora;
    private int minuto;
    private int segundo;

    //metodo constor sin parametros de la clase Tiempo

    public Tiempo(){

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


    public static void main(String[] args){

        Tiempo tiempo=new Tiempo();

        //se establece una hora x solo para mostrar que funciona.
        tiempo.setHora(12);
        tiempo.setMinuto(45);
        tiempo.setSegundo(34);

        System.out.print("hora actual: "+tiempo.getHora()+":"+tiempo.getMinuto()+":"+tiempo.getSegundo());


    }

}
