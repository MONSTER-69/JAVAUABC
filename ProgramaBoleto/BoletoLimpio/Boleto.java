


public class Boleto {
    //atributos 
    private String Codigo_Barras;
    private Fecha Entrada_fecha;
    private Tiempo Entrada_Hora;
    private Fecha Salida_Fecha;
    private Tiempo Salida_Hora;
    //private Fecha fecha;
    //private Tiempo tiempo;

    //metodo constructor sin parametros de la clase Boleto.
   
    public Boleto(){

        this.Codigo_Barras="000000";
        
        this.Entrada_fecha=new Fecha();
        this.Entrada_Hora=new Tiempo();
        this.Salida_Fecha=new Fecha();
        this.Salida_Hora=new Tiempo();
        //this.fecha=new Fecha();
        //this.tiempo=new Tiempo();
    }

    //metodo set del atirbuto boleto, que establece un valor para Codigo_Barras.

    public void setCodigoBarras(String Codigo_Barras){

        this.Codigo_Barras=Codigo_Barras;

    }

    public String getCodigoBarras(){

        return Codigo_Barras;
    }

    //metodos get y set para establecer horas de entrada y de salida

    public void setEntradaFecha(int dia,int mes,int anio){

        Entrada_fecha.setDia(dia);
        Entrada_fecha.setMes(mes);
        Entrada_fecha.setAnio(anio);
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


    public static void main(String[] args){

        Boleto boleto=new Boleto();

        boleto.Entrada_fecha.setDia(25);
        boleto.Entrada_fecha.setMes(3);
        boleto.Entrada_fecha.setAnio(2023);

        boleto.Entrada_Hora.setHora(9);
        boleto.Entrada_Hora.setMinuto(15);
        boleto.Entrada_Hora.setSegundo(34);

        boleto.Salida_Fecha.setDia(26);
        boleto.Salida_Fecha.setMes(3);
        boleto.Salida_Fecha.setAnio(2023);

        boleto.Salida_Hora.setHora(10);
        boleto.Salida_Hora.setMinuto(34);
        boleto.Salida_Hora.setSegundo(34);

        System.out.print("la fecha de entrada es: "+boleto.Entrada_fecha.getDia()+"/"+boleto.Entrada_fecha.getMes()+"/"
        +boleto.Entrada_fecha.getAnio());

        System.out.print("\nhora de salida: "+boleto.getEntradaHora().getHora()+":"+boleto.getEntradaHora().getMinuto()+":"+boleto.getEntradaHora().getSegundo());

        System.out.print("\nFecha de salida: "+boleto.getSalidaFecha().getDia()+"/"+boleto.getSalidaFecha().getMes()+"/"+boleto.getSalidaFecha().getAnio());

        System.out.print("\nHora de salida: "+boleto.getSalidaHora().getHora()+":"+boleto.getSalidaHora().getMinuto()+":"+boleto.getSalidaHora().getSegundo());



        
    }


    
}
