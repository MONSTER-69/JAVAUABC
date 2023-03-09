/*
garcia chavez erik 01275863
programacion orinetada a objetos 
laboratorio 20 de febrero del 2020
sukey sayonara nakasima lopez
*/
public class ejer1{ 

    public static void main(String[] args){

        System.out.print("utilizando el ciclo while\n");

        //length funciona para acceder al totoal de elemenots dentro del arreglo al ser una propiedad y no un metodo.
        int i=0;
        while(i<args.length){
            System.out.print("elemento #"+i+": "+args[i]+"\n");
            i++;
        }

        System.out.print("\n");


        System.out.print("utilizando el ciclo do-while");
        
        //cunado se utiliz el mismo iterador en este caso, debemos limpiarlo, para que la varibale quede en 0 de nuevo.
        i=0;
        do{ 
            
            System.out.print("elemento #"+i+": "+args[i]+"\n");
            i++;


        }while(i<args.length);

        System.out.print("\n");

        System.out.print("utilizando el ciclo for\n");

        for(i=0;i<args.length;i++){
            System.out.print("elemmenot #"+i+": "+args[i]+"\n");

        }

        
    }

}