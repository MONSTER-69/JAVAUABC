package boleto;





public class Boleto  {

    private String Codigo_Barras;
    private Fecha Entrada_fecha;
    private Tiempo Entrada_Hora;
    private Fecha Salida_Fecha;
    private Tiempo Salida_Hora;
    private Fecha fecha;
    private Tiempo tiempo;

    //metodo constructor;
   
    public Boleto(){

        this.Codigo_Barras="000000";
        
        this.Entrada_fecha=new Fecha();
        this.Entrada_Hora=new Tiempo();
        this.Salida_Fecha=new Fecha();
        this.Salida_Hora=new Tiempo();
        this.fecha=new Fecha();
        this.tiempo=new Tiempo();
    }

    public void setCodigoBarras(String Codigo_Barras){

        this.Codigo_Barras=Codigo_Barras;

    }

    public String getCodigoBarras(){

        return Codigo_Barras;
    }

    public void setEntradaFecha(int dia,int mes,int anio){

        Entrada_fecha.setDia(dia);
        Entrada_fecha.setMes(mes);
        Entrada_fecha.setAnio(anio);

        //fecha.setDia(dia);
        //fecha.setMes(mes);
        //fecha.setAnio(anio);
    }

    public Fecha getEntradaFecha(){

        return Entrada_fecha;
    }

    public void setEntradaHora(int hora,int minuto,int segundo){
        
        
        Entrada_Hora.setHora(hora);
        Entrada_Hora.setMinuto(minuto);
        Entrada_Hora.setSegundo(segundo);

    }

    public Tiempo getEntradaHora(){

        return Entrada_Hora;
    }


    public void setSalidaFecha(int dia,int mes,int anio){

        Salida_Fecha.setDia(dia);
        Salida_Fecha.setMes(mes);
        Salida_Fecha.setAnio(anio);
    }

    public Fecha getSalidaFecha(){

        return Salida_Fecha;
    }

    public void setSalidaHora(int hora,int minuto,int segundo){

        Salida_Hora.setHora(hora);
        Salida_Hora.setMinuto(minuto);
        Salida_Hora.setSegundo(segundo);
    }

    public Tiempo getSalidaHora(){

        return Salida_Hora;
    }

    //taller 3 validacion de fecha y tiempo

    public void setFecha(int dia,int mes,int anio){

        this.fecha.setAnio(anio);
        this.fecha.setMes(mes);
        this.fecha.setDia(dia);

        

    }

    public Fecha getFecha(){

        return fecha;
    }

    public void ValidarFecha(int dia,int mes,int anio){

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

    public void setTiempo(int hora,int minuto,int segundo){

        this.tiempo.setHora(hora);
        this.tiempo.setMinuto(minuto);
        this.tiempo.setSegundo(segundo);
        
    }


    public Tiempo getTiempo(){

        return tiempo;
    }


    public void ValidarTiempo(int horas,int minutos, int segundos){


        if(horas>=1 && horas<=24){
            if(minutos>=1 && minutos<=60){
                if(segundos>=1 && segundos<=60){

                    System.out.print("hora: "+horas+":"+minutos+":"+segundos);
                }
                else{
                    System.out.print("\nlos segundos estan fuera de rango [1,60]");
                }

               
               
            }
            else{
                System.out.print("\n los segundos estan fuera de rango[1,60]");
            }

        }
        else{
            System.out.print("\nlas horas estan fuera de rango[1,60]");
        }
    }


    public static void main(String[] args){


        Boleto entrada=new Boleto();

        entrada.setEntradaHora(2, 34, 34);
        entrada.setSalidaFecha(3, 7, 2003);
        entrada.setSalidaHora(4, 57, 23);

        entrada.setTiempo(2, 34, 34);


        

        //esta madre de if no debe de ir aqui, necesito hacer una clase que se cnargue de esto.

        /* 

        if(entrada.Entrada_fecha.getMes()>=1 && entrada.Entrada_fecha.getMes()<=12){

            Fecha Entrada_Fecha=entrada.getEntradaFecha();
            Tiempo Entrada_Tiempo=entrada.getEntradaHora();
            //System.out.println("la fecha de entrada es: "+ Entrada_Fecha.getDia()+"/"+Entrada_Fecha.getMes()+"/"+Entrada_Fecha.getAnio());
            //System.out.println("la hora de intrada es: "+Entrada_Tiempo.getHora()+":"+Entrada_Tiempo.getMinuto()+":"+Entrada_Tiempo.getSegundo());
            if(entrada.Entrada_fecha.getDia()>=1 && entrada.Entrada_fecha.getDia()<=31){
                System.out.print("la fecha de entrada es: "+ Entrada_Fecha.getDia()+"/"+Entrada_Fecha.getMes()+"/"+Entrada_Fecha.getAnio());
                

            }
            else{
                System.out.println("\nel dis esta fuera de rango [1,31]");
            }

            if(entrada.tiempo.getHora()>=1 && entrada.tiempo.getHora()<=24){
                if(entrada.tiempo.getMinuto()>=1 && entrada.tiempo.getMinuto()<=60){
                    if(entrada.tiempo.getSegundo()>=1 && entrada.tiempo.getSegundo()<=60){
                        System.out.print("\nla hora de intrada es: "+Entrada_Tiempo.getHora()+":"+Entrada_Tiempo.getMinuto()+":"+Entrada_Tiempo.getSegundo());

                    }
                    else{
                        System.out.print("los segundos estan fuera de rango [1,60]");
                    }

                }
                
                else{
                    System.out.print("los mintos estan fuera de rango [1,60]");
                }



            }
            else{
                System.out.print("\nla hora esta fuera de rango [1,24]");
            }

            
        }

        else{
            System.out.print("\nEl mes esta fuera de rango [1,12]");
        }

        

        //Fecha Entrada_Fecha=entrada.getEntradaFecha();
        //Tiempo Entrada_Tiempo=entrada.getEntradaHora();
        Fecha Salida_Fecha=entrada.getSalidaFecha();
        Tiempo Salida_Hora=entrada.getSalidaHora();




        //System.out.println("la fecha de entrada es: "+ Entrada_Fecha.getDia()+"/"+Entrada_Fecha.getMes()+"/"+Entrada_Fecha.getAnio());
        //System.out.println("la hora de intrada es: "+Entrada_Tiempo.getHora()+":"+Entrada_Tiempo.getMinuto()+":"+Entrada_Tiempo.getSegundo());
 
        System.out.println("\nla fecha de salida es: "+Salida_Fecha.getDia()+"/"+Salida_Fecha.getMes()+"/"+Salida_Fecha.getAnio());
        System.out.println("\nla hora de salida fue: "+Salida_Hora.getHora()+":"+Salida_Hora.getMinuto()+":"+Salida_Hora.getSegundo());*/


    }
    
}
