package taller2marzoV2;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //metodo constructor 
    /*en el metodo construcor lo que hace es incializar los atributos.*/
    public Fecha(){
        this.dia=2;
        this.mes=3;
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


    public static void main(String[] args){
        
        Fecha fecha=new Fecha();

        System.out.println(" la fecha actual es: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());


    }
    
}
