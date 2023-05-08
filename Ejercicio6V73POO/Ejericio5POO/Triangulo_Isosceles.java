package Ejericio5POO;




public class Triangulo_Isosceles{

    //atrinutos
    private double base;
    private double lado;

    private Triangulo_Isosceles(double base, double lado){
        this.base=base;
        this.lado=lado;
    }

    //metodo para calcular el peritmetro 

    private double getPerimetro(){

        double peritmetro = 2*(lado+base);

        return peritmetro;
    }


    //metodo que calcula el are
    public double obetenerArea(){

        double area= ( base * ( Math.sqrt( (Math.pow(lado, 2)) - ( (Math.pow(base, 2)) /4 ) ) ) )/2;
        
        return area;
    }

    public String obetenerDatos(){
        return " Base: "+ base + " \nLado: "+"\nPerimetro: "+getPerimetro() +"\nAre: "+obetenerArea()+"\n"; 
    }






}