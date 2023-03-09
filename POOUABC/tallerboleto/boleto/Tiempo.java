/*garcia chavez erik 01275863 
	programacion orientada a objetos 
	
*/

package boleto;

import java.util.Scanner;

public class Tiempo {
    //atributos 
    private int hora;
    private int minuto;
    private int segundo;

    //metodo contructor 

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

    public void setTiempo(int hora,int minutos, int segundos){

        this.setHora(hora);
        this.setMinuto(minutos);
        this.setSegundo(segundos);

    }


    public void ValidarTiempo(int horas,int minutos, int segundos){


        if(this.getHora()>=1 && this.getHora()<=24){
            if(this.getMinuto()>=1 && this.getMinuto()<=60){
                if(this.segundo>=1 && this.getSegundo()<=60){

                    System.out.print("hora: "+horas+":"+minutos+":"+segundos);
                }
                else{
                    System.out.print("\nlos segundos estan fuera de rango [1,60]");
                }

               
               
            }
            else{
                System.out.print("\n los minutos12 estan fuera de rango[1,60]");
            }

        }
        else{
            System.out.print("\nlas horas estan fuera de rango[1,60]");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args){


        Scanner entrada=new Scanner(System.in);
        Tiempo tiempo =new Tiempo();

        int hora,minuto,segundo;

        System.out.print("\ningrese las hora: ");
        hora=entrada.nextInt();

        System.out.print("\ningrese los minutos: ");
        minuto=entrada.nextInt();

        System.out.print("ingrese los segundos: ");
        segundo=entrada.nextInt();

        tiempo.setTiempo(hora, minuto, segundo);

        tiempo.ValidarTiempo(hora, minuto, segundo);
        

        entrada.close();

   
       // System.out.println("la hora de entrada es de: "+tiempo.getHora()+":"+tiempo.getMinuto()+":"+tiempo.getSegundo());

        

    }
}
