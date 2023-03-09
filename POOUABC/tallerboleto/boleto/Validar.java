package boleto;

import java.util.Scanner;


public class Validar {

    private int dia;
    private int mes;
    private int anio;


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

    public void ValidarFecha(int dia, int mes, int anio){

        
        if(mes>=1 && mes<=12){
            if(dia>=1 && dia<=31){

               System.out.print("\nla fecha de entrada es valida fecha:"+dia+":"+mes+":"+anio);
               
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

        Scanner into=new Scanner(System.in);
        Validar fecha=new Validar();

        int dia,mes,anio;

        System.out.print("ingrese una dia: ");

        dia=into.nextInt();

        System.out.print("\ningrese el mes: ");
        mes=into.nextInt();

        System.out.print("\ningrese el anio");
        anio=into.nextInt();


        fecha.ValidarFecha(dia, mes, anio);



        



    }

    
}
