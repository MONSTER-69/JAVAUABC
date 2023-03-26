


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

    //preactica 1 laboratorio 3 

    public void setTiempo(int hora,int minuto){

        this.setHora(hora);
        this.setMinuto(minuto);
    }

    public void validarTiempo(int hora, int minuto, int segundo){


        if(hora>=1 && hora<=24){
            if(minuto>=1 && minuto<60){
                System.out.print("hora establecida correctamente: "+hora+":"+minuto+":"+segundo);
            }
            else{
                System.out.print("los minutos/segundos estan fuera de rango [1,59]");
            }
        }
        else{
            System.out.print("la hora esta fuera de rango [1,24]");
        }
    }


    public static void main(String[] args){

        Tiempo tiempo=new Tiempo();

        //se establece una hora x solo para mostrar que funciona.
        tiempo.setHora(15);
        tiempo.setMinuto(45);
        tiempo.setSegundo(34);

        tiempo.validarTiempo(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
        


    }

}
