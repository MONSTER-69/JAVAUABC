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
    //COMINEZO DEL LABORATORIO 2 SOBRECARGA DE METODOS, INSTANCIA Y INSTANCIA DE CLASES
    public Tiempo(){

        this.hora=0;
        this.minuto=0;
        this.segundo=0;

    }
    public Tiempo(int hora,int minutos){

        this.hora=hora;
        this.minuto=minutos;
    }

    public Tiempo(int hora,int minutos,int segundo){

        this.hora=hora;
        this.minuto=minutos;
        this.segundo=segundo;
    }
    //METODOS setTiempo de sobrecarga 

    public void setTiempo(int hora,int minutos){
        this.setHora(hora);
        this.setMinuto(minutos);
    }

    public void setTiempo(int hora,int minutos,int segundo){

        this.setHora(hora);
        this.setMinuto(minutos);
        this.setSegundo(segundo);



    }

    //metodos de la clase que nos a permitir validar le timepo.


    public static int validarTiempo(int hora,int minuto){

        if(hora>=1 && hora<=24){
            if(minuto>=1 && minuto<=60){
                
                return 1; //este metodo va a devolver un 1 si se cumplen con los parametros

            }
        }
        return 0;
    }

    public static int validarTiempo(int hora,int minuto,int segundo){

        if(hora>=1 && hora<=24){
            if(minuto>=1 && minuto<=60){
                if(segundo>=1 && segundo<=60){

                    return 1; //al igual que con el metodo de 2 paramtros, este devuelve un 1 si las condiciones se cumplen, osea que el tiempo se cumple y un 0 si no.
                }

            }
        }


        return 0;
    }
    /*pero porque se utiliza estos metodos, de la clase, para hacer cosas como estas, validar una fecha o el tiempo, porque tan solo necesita en este caso los valores de horas y minutos, para poder funcionar el metodo, pero al igual no, como el metodo main, que no necsita instancia para poder ejecutarse, porque es un metodo de la clase no del objeto. */
    //FINAL DEL LABORATORIO 2 DE LA CLASE TIEMPO


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

    /* 
    public void setTiempo(int hora,int minutos, int segundos){

        this.setHora(hora);
        this.setMinuto(minutos);
        this.setSegundo(segundos);

    }*/


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
        int dos,tres;

        System.out.print("\ningrese las hora: ");
        hora=entrada.nextInt();

        System.out.print("\ningrese los minutos: ");
        minuto=entrada.nextInt();

        System.out.print("ingrese los segundos: ");
        segundo=entrada.nextInt();

        tiempo.setTiempo(hora, minuto);

        dos=Tiempo.validarTiempo(hora, minuto);

        System.out.print("validar 2 parametros\n");

        if(dos==1){
            System.out.print("\nHora: "+tiempo.getHora()+":"+tiempo.getMinuto()+":"+tiempo.getSegundo());
        }
        else{
            System.out.print("\nalgunos de los parametros estan fuera de rango");
        }

        tiempo.setTiempo(hora, minuto, segundo);
        tres=Tiempo.validarTiempo(hora, minuto, segundo);

        System.out.print("\ntres parametros");

        if(tres==1){
            System.out.print("\nHora: "+tiempo.getHora()+":"+tiempo.getMinuto()+":"+tiempo.getSegundo());
        }
        else{
            System.out.print("\nalgunos de los parametros estan fuera de rango");
        }
        
        entrada.close();



        //tiempo.setTiempo(hora, minuto, segundo);

        //tiempo.ValidarTiempo(hora, minuto, segundo);
        

        //entrada.close();

   
       // System.out.println("la hora de entrada es de: "+tiempo.getHora()+":"+tiempo.getMinuto()+":"+tiempo.getSegundo());

        

    }
}


