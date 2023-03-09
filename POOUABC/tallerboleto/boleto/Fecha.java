/*garcia chavez erik 01275863 
	programacion orientada a objetos 
	
*/
package boleto;

import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //metodo constructor 
    /*en el metodo construcor lo que hace es incializar los atributos.*/
    public Fecha(){
        this.dia=2;
        this.mes=1;
        this.anio=2023;

    }

    public void setDia(int dia){

        this.dia=dia;

    }
    public int getDia(){

        return dia;

    }

    public void setMes(int mes){

        this.mes=mes;
    }

    public int getMes(){

        return mes;
    }

    public void setAnio(int anio){

        this.anio=anio;
    }

    public int getAnio(){
        return anio;
    }

    public void setFecha(int dia,int mes, int anio){

        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);

    }


    public void ValidarFecha(int dia,int mes,int anio){

        if(this.getMes()>=1 && this.getMes()<=12){
            if(this.getDia()>=1 && this.getDia()<=31){
                if(this.getAnio()>=1990 && this.getAnio()<=2023){

                    System.out.print("\nla fecha de entrada es valida \nfecha: "+dia+"/"+mes+"/"+anio);

                }
                else{
                    System.out.print("\nel anio ingresaro esta fuera de rango [1990-2023]");
                }

              
               
            }
            else{
                System.out.print("\n el dia esta fuera de rango [1,31]");
            }

        }
        else{
            System.out.print("\nel mes esta fuera de rango [1,12]");
        }

    }


    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);
        
        Fecha fecha=new Fecha();

        int dia,mes,anio;


        System.out.print("ingrese el dia: ");
        dia=entrada.nextInt();

        System.out.print("\ningrese el mes: ");
        mes=entrada.nextInt();

        System.out.print("ingrese el anio: ");
        anio=entrada.nextInt();

        fecha.setFecha(dia, mes, anio);

        fecha.ValidarFecha(dia, mes, anio);

        entrada.close();



        //System.out.println(" la fecha actual es: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());


    }
    
}
