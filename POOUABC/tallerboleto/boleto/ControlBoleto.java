package boleto;




public class ControlBoleto {
    //atributos
    private Boleto boleto;
    private float Precio_Hora;
    

    //metodo constructor
    public ControlBoleto(){

        this.Precio_Hora=3.4f;
        this.boleto=new Boleto();
        //Fecha fecha=new Fecha();
        //ControlBoleto entrada=new ControlBoleto();

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

    //vamos a hacer mejor el metodo para cunado sea el mismo dia, ya vamos a pensar como aplicarlo para cunado sean meses diferentes
    public float controlPago(int horaE,int minutoE,int segundoE,int horaS,int minutoS,int segundoS){


        //aqui vamos a calcular las horas totales que tuvo en el estacionamineto, primero validando si han pasado dias, meses, anios, horas, minutos o segundos desde su inicalizacio
        //float precio=0;
        int horasDif=0;
        int minDif=0;
        int segDif=0;
        //int difDias=0;
        //int difMes=0;

        int Total=0;


        horasDif=(getBoleto().getSalidaHora().getHora())-(getBoleto().getEntradaHora().getHora());
        minDif=(int)(((getBoleto().getSalidaHora().getMinuto())-(getBoleto().getEntradaHora().getMinuto()))*0.167);
        segDif=(int) (((getBoleto().getSalidaHora().getSegundo())-(getBoleto().getEntradaHora().getSegundo()))*0.000278);

        Total=horasDif+minDif+segDif;

        
            //calcular entre los meses y dias

          

                //calcular solo las horas entre los dias 

                

                    //calcular solo los que hay entre las horas 

                    //primero las salidas y despues la entrad que asi el resultado sea positivo
        /* 
                    horasDif=(getBoleto().getSalidaHora().getHora())-(getBoleto().getEntradaHora().getHora());
                    minDif=(getBoleto().getSalidaHora().getMinuto())-(getBoleto().getEntradaHora().getMinuto());
                    segDif=(getBoleto().getSalidaHora().getSegundo())-(getBoleto().getEntradaHora().getSegundo());

                    Total=horasDif+minDif+segDif;

                    
                    return Total;*/
               
                     //como vamos a caluclar los dias que han poasdo, restando el dia se salida menos el dia de entrada por 24 horas que dura un dia 


                    //difDias=((boleto.getSalidaFecha().getDia())-(boleto.getEntradaFecha().getDia()))*24;

                   

                    //Total=difDias+horasDif+minDif+segDif;

                    //return Total;

                /* 

                difDias=((boleto.getSalidaFecha().getDia())-(boleto.getEntradaFecha().getDia()))*24;

                horasDif=(getBoleto().getSalidaHora().getHora())-(getBoleto().getEntradaHora().getHora());
                minDif=(getBoleto().getSalidaHora().getMinuto())-(getBoleto().getEntradaHora().getMinuto());
                segDif=(getBoleto().getSalidaHora().getSegundo())-(getBoleto().getEntradaHora().getSegundo());

                Total=difDias+horasDif+minDif+segDif;

                return Total;*/


                return Total;

            
        


    }

   


   

    public float CalcularPago(float Horas_Estacionamiento,float Precio_Hora){


        float precio=0;

        precio=Horas_Estacionamiento*Precio_Hora;

    //esta la vamos a cambiar
    return precio;
    }


    public static void main(String[] args){

        //vamos a definir objetos de la clase boleto, sin parametros, con 4 parametros y 6 parametros

        Boleto boleto1=new Boleto(); //este constructor no tiene ni un valor 
        Boleto boleto2=new Boleto(15, 3, 13, 47);//este constructor tiene 4 parametros, dias,mes,hora y minutos
        Boleto boleto3=new Boleto(15, 3, 2023, 13, 48, 23);//este constructor tiene 6 parametros y lo que haremos es intanciar el objeto.

        boleto1.setFecha(15, 3, 2023);
        System.out.print("imprimiendo la informacion del boleto sin parametros\n");
        System.out.println("boleto 2: "+boleto1.getEntradaFecha().getFechaD(2023));



        /* este es el codigo pasado que hicimos sin metodos de clase,  lo vamos a comentar solo para copiar y pegar
        Boleto boleto=new Boleto();
        ControlBoleto control=new ControlBoleto();

        int horaE=3,minutoE=45,segundoE=39,horaS=7,minutoS=39,segundoS=55,diaE=13,mesE=3,anioE=2023,diaS=13,mesS=3,anioS=2023;
        float Horas=0;
        float precio=0;

        //este es el precio por hora 
        control.setPrecioHora(7.5f);

        boleto.setEntradaFecha(diaE, mesE, anioE);
        boleto.setEntradaHora(horaE, minutoE, segundoE);
        boleto.setSalidaFecha(diaS, mesS, anioS);
        boleto.setSalidaHora(horaS, minutoS, segundoS);


        control.setBoleto(boleto.getEntradaFecha().getDia(), boleto.getEntradaFecha().getMes(), boleto.getEntradaFecha().getAnio(), boleto.getEntradaHora().getHora(),boleto.getEntradaHora().getMinuto(),boleto.getEntradaHora().getSegundo(), boleto.getSalidaFecha().getDia(), boleto.getSalidaFecha().getMes(), boleto.getSalidaFecha().getAnio(), boleto.getSalidaHora().getHora(), boleto.getSalidaHora().getMinuto(), boleto.getSalidaHora().getSegundo());


        Horas=control.controlPago(boleto.getEntradaHora().getHora(),boleto.getEntradaHora().getMinuto(),boleto.getEntradaHora().getSegundo(),boleto.getSalidaHora().getHora(), boleto.getSalidaHora().getMinuto(), boleto.getSalidaHora().getSegundo());

        precio=control.CalcularPago(Horas, control.getPrecio());


        System.out.println("la fecha de entrada es: "+ boleto.getEntradaFecha().getDia()+"/"+ boleto.getEntradaFecha().getMes()+"/"+boleto.getEntradaFecha().getAnio());
        System.out.println("la hora de intrada es: "+boleto.getEntradaHora().getHora()+":"+boleto.getEntradaHora().getMinuto()+":"+boleto.getEntradaHora().getSegundo());

        System.out.println("la fecha de salida es: "+boleto.getSalidaFecha().getDia()+"/"+boleto.getSalidaFecha().getMes()+"/"+boleto.getSalidaFecha().getAnio());
        System.out.println("la hora de salida fue: "+boleto.getSalidaHora().getHora()+":"+boleto.getSalidaHora().getMinuto()+":"+boleto.getSalidaHora().getSegundo());

        System.out.print("\nel precio total es de: "+precio);*/










    }
    



    







}
