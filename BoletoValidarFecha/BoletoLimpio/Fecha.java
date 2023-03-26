

public class Fecha{

    //atributos del objeto, de la instancia 
    private int dia;
    private int mes;
    private int anio;


    //metodo constructor sin parametros.
    public Fecha(){
        this.dia=29;
        this.mes=2;
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

    //Laboratorio 3 practica 1 

    //1-definir un metodo setFecha que pida como parametros dia,mes,anio

    public void setFecha(int dia,int mes,int anio){

        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);

    }

    public void ValidarFecha(int dia,int mes,int anio){





        if(mes>=1 && mes<=12){


            switch(mes){

                case 1 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 3 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 5 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 7 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 8 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 10 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 12 : {//aqui entramos al mes de enro
                    if(dia>=1 && dia<=31){ 
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,31]");
                    }
                };break;

                case 4:{
                    if(dia>=1 && dia<=30){
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,30]");

                    }
                };break;
                case 6:{
                    if(dia>=1 && dia<=30){
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,30]");

                    }
                };break;
                case 9:{
                    if(dia>=1 && dia<=30){
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,30]");

                    }
                };break;
                case 11:{
                    if(dia>=1 && dia<=30){
                        System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                    }
                    else{
                        System.out.print("\nel dia esta fuera de rango [1,30]");

                    }
                };break;

                case 2: {
                    if(anio%4==0){//si el anio es divible entre 4 entonces quiere decir que el anio es biciesto por lo que febrero tendra los 29 dias
                        if(dia>=1 && dia<=29){
                            //como ya etamos dentro del mes 2, tansolo estamos comporbanod si el anio es biciente, en este caso si lo es febrerp tendra los 29 dias
                            System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);
                        }
                        else{
                            System.out.print("el dia esta fuera rango, febero en anio biciento cuenta con [1,29] dias");
                        }

                    }
                    //en caso de que no sea anio bicienteo entonces febrero solo tiene 28 dias 
                    else{
                        if(dia>=1 && dia<=28){
                            System.out.print("\nfecha de entrada: "+dia+"/"+mes+"/"+anio);

                        }
                        else{
                            System.out.print("dia fuera de ranto, febrero en anio biciesto solo cuenta con 28 dias [1,28]");
                        }
                    }
                };break;



            }
        }
        else{
            System.out.print("les mes esta fuera de rango [1,12]");
        }
        
    }


    public static void main(String[] args){

        //se cre un objeto fecha de la clase Fecha.
        Fecha fecha=new Fecha();

        //System.out.print("Fecha: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());

        //poner para validar la fecha.

        fecha.ValidarFecha(fecha.getDia(), fecha.getMes(), fecha.getAnio());

    }
}