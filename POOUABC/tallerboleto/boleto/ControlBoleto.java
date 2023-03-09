package boleto;

import java.util.Scanner;

import javax.sound.sampled.Control;

public class ControlBoleto {
    //atributos
    private Boleto boleto;
    private float Precio_Hora;
    

    //metodo constructor
    public ControlBoleto(){

        this.Precio_Hora=3.4f;
        this.boleto=new Boleto();
        Fecha fecha=new Fecha();
        ControlBoleto entrada=new ControlBoleto();

    }

    //metodo set y get de boelto

    public void setBoleto(int diaE,int mesE,int anioE,int horaE,int minutoE,int segundoE,int diaS,int mesS,int anioS,int horaS,int minutoS,int segundoS){

       boleto.setEntradaFecha(diaE, mesE, anioE);
       boleto.setEntradaHora(horaE, minutoE, segundoE);
       boleto.setSalidaFecha(diaS, mesS, anioS);
       boleto.setSalidaHora(horaS, minutoS, segundoS);
    }

    public Boleto getBoleto(){
        
        
        return boleto; 
    }


    public void setPrecioHora(float precioHora){

        this.Precio_Hora=precioHora;
    }

    public float getPrecio(){


        return Precio_Hora;
    }

   

    public float CalcularPago(float Horas_Estacionamiento,float Precio_Hora){

    float precio=0;


    //esta la vamos a cambiar
    return precio;
    }

    public static void main(String[] args){

        Scanner into=new Scanner(System.in);
        Boleto boleto=new Boleto();
        ControlBoleto control=new ControlBoleto();

        int horaE=0,minutoE=0,segundoE=0,horaS=0,minutoS=0,segundoS=0;
        int Horas=0;

        //este es el precio por hora 
        control.setPrecioHora(7.5f);

        System.out.print("ingrese la hora de entrada: ");
        horaE=into.nextInt();
        System.out.print("\ningrese el minuto:  ");
        minutoE=into.nextInt();
        System.out.print("\ningrese el segundo de entrada");
        segundoE=into.nextInt();

        System.out.println("\n");
        System.out.print("ingrese la hora de salida: ");
        horaS=into.nextInt();
        System.out.print("\ningrese el minuto de salida: ");
        minutoS=into.nextInt();
        System.out.print("\ningrese el segundo de salida: ");
        segundoS=into.nextInt();

        



        control.setBoleto(5, 3, 2003, horaE, minutoE, segundoE, 6, 3, 2003, horaS, minutoS, segundoS);

        

        


       

        
        Fecha entrada=boleto.getEntradaFecha();

        System.out.println(entrada.getDia());
       

       

    






    }
    



    







}
