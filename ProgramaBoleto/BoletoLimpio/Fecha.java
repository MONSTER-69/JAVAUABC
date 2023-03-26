

public class Fecha{

    //atributos del objeto, de la instancia 
    private int dia;
    private int mes;
    private int anio;


    //metodo constructor sin parametros.
    public Fecha(){
        this.dia=1;
        this.mes=1;
        this.anio=2023;
    
    }

    //metodos set y gets de la clase Fecha 

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

    public static void main(String[] args){

        //se cre un objeto fecha de la clase Fecha.
        Fecha fecha=new Fecha();

        System.out.print("Fecha: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());
    }
}