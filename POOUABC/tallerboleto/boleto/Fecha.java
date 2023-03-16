/*garcia chavez erik 01275863 
	programacion orientada a objetos 
	
*/
package boleto;

import java.util.Scanner;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //metodo constructor 
    /*en el metodo construcor lo que hace es incializar los atributos.*/
   //sobrecarga de constructores

   //------PRACTICA 2
    public Fecha(){
    this.dia=1;
    this.mes=1;
    this.anio=2023;

    }

    //se pueden tener mas de 2 costructores con el mismo nombre, lo que los va a diferenciar son sus parametros, a esto se le llama sobrecarga de constructores o metodos.
    public Fecha(int dia,int mes){

        this.dia=dia;
        this.mes=mes;

    }

    public Fecha(int dia,int mes,int anio){

        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }//final de los constructores

    public void setFecha(int dia,int mes){
        this.setAnio(2023);
        this.setDia(dia);
        this.setMes(mes);
    }

    public void setFecha(int dia,int mes,int anio){

        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);

    }

    public int getFechaD(int dia){
        return dia;
    }

    public int getFechaM(int mes){
        return mes;
    }

    public int getFechaA(int anio){
        
        return anio;
    }
    

    //construir el metodo de la clase que va a validar los dias, asi como validar su febrero va a tener 29 dias
    //sobrecarga con 3 metodos.

    public static int validesFecha(int dia,int mes,int anio){



        if(anio%4==0){//si el anio es divible entre 4 entonces quiere decir que el anio es biciesto por lo que febrero tendra los 29 dias
            if(mes==2){//si es mes es igual al 2, osea que sea febrero en este caso vamos a comprobrar que tenga maximo 29 dias
                if(dia>=1 && dia<=29){ //aqui vamos a comprobar que los dias sean mayores a 1 pero menosres a 29
                    return 1; //por lo que el metodo va a regrear un 1
                }
            }
        }
        else{ //en caso de que el anio no sea biciesto, por lo que nos mandara al else, aqui seran los meses normales, con la excepcion de que febrero tendra 28 dias

            if(mes==2){//por lo que volvemos a comprobar si el mes 2 tiene los 28 dias.
                if(dia>=1 && dia<=28){
                    return 1; //por lo que si la condicion se cumple regresara un 1

                }
            }
            else{//en este punto los meses ya correran normalmente.z
                if(dia>=1 && dia<=31 ){
                    if(mes>=1 && mes<=12){
        
                        return 1; //el metodo de la clase va a retornar un 1 si la condicion se cumple, que los dias y los meses estan en lo correcto
        
                        
        
        
                    }
        
                }
            }

        }


        return 0; //el metodo va a regresar 0 si los pareamrtros no se cumplen.
    }

    //sobreccarga en donde solo hay 2 parametos, dia y mes

    public static int ValidarFecha(int dia,int mes){

        if(mes>1 && mes<12){
            if(dia>1 && dia<31){
                return 1;//regresa un 1 si se cumplen con los parametros
            }
        }

        return 0; //regresa un 0 si no se cumplen con los parametros.
    }

    //FINAL DE LA CLASE FECHA DEL LABORATORIO 2

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

    /* 
    public void setFecha(int dia,int mes, int anio){

        this.setDia(dia);
        this.setMes(mes);
        this.setAnio(anio);

    }*/


    public void ValidarFecha(int dia,int mes,int anio){

        if(this.getMes()>=1 && this.getMes()<=12){
            if(this.getDia()>=1 && this.getDia()<=31){
                if(this.getAnio()>=1990 && this.getAnio()<=2023){

                    System.out.print("\nla fecha de entrada es valida \nfecha: "+dia+"/"+mes+"/"+anio);

                }
                else{
                    System.out.print("\nel anio ingresaro esta fuera de rango [1990-2023]");
                }

              
               
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

        Scanner entrada=new Scanner(System.in);
        
        Fecha fecha=new Fecha();

        int dia,mes,anio;
        int dos,tres;

        
        System.out.print("ingrese el dia: ");
        dia=entrada.nextInt();

        System.out.print("\ningrese el mes: ");
        mes=entrada.nextInt();

        System.out.print("ingrese el anio: ");
        anio=entrada.nextInt();

        fecha.setFecha(dia, mes);

        //observemos como aqui no necsito llamar al metodo ValidarFecha con el objeto fecha, porque este metodo es un metodo de la clase, no es instancia de un objeto, por lo que para acceder a el solo nos hce falta poner el (nombre de la clase.) y los saldra los metodos de la clase recordando que estos son de tipo static
        dos=Fecha.ValidarFecha(dia, mes);
        System.out.print("\ndos parametros");
        
        if(dos==1){
            System.out.print("\nla fecha es: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());
        }
        else{
            System.out.print("\nalguno de los parametros estan fuera de rango.");
        }

        fecha.setFecha(dia, mes, anio);
        tres=Fecha.validesFecha(dia, mes, anio);
        System.out.print("\n3 parametros");

        if(tres==1){
            System.out.print("\nla fecha es: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());
        }
        else{
            System.out.print("\nalguno de los parametros estan fuera de rango.");
        }

        entrada.close();



        //System.out.println(" la fecha actual es: "+fecha.getDia()+"/"+fecha.getMes()+"/"+fecha.getAnio());


    }
    
}
