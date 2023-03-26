public class ControlBoleto {

    //atributos
    private Boleto boleto;
    private float Precio_Hora;

    //metodo constructor sin parametros
    public ControlBoleto(){

        this.Precio_Hora=3.4f;
        this.boleto=new Boleto();

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

    public float calcularPago(float HorasEstacionamineto,float precioHora){

        float precio;

        precio=HorasEstacionamineto*precioHora;

        return precio;
    }


    public static void main(String[] args){


        ControlBoleto control=new ControlBoleto();

        control.boleto.setEntradaFecha(33, 3, 2023);
        control.boleto.setEntradaHora(9, 35, 23);
        control.boleto.setSalidaFecha(25, 3, 2023);
        control.boleto.setSalidaHora(10, 23, 23);
        
        ///valida la fecha de entrada, algo asi seria para validar la fecha no?
        control.boleto.getEntradaFecha().ValidarFecha(control.boleto.getEntradaFecha().getDia(), control.boleto.getEntradaFecha().getMes(), control.boleto.getEntradaFecha().getMes());
        System.out.print("la cantidad a pagar es de:"+control.calcularPago(48, control.Precio_Hora));

        
    
    }

    
}
