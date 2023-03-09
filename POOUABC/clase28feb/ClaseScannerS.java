/*garcia chavez erik 01275863
 porgramacion orientada a objetos
 laboratorio 2. estructura switch-case y peticion de datos.
 martes 28 de febrero del 2023
 */

import java.util.Scanner;

public class ClaseScannerS{

    //funcion que usa el ciclo while 
    public static void Cwhiile(String[] args){

        int i=0;
        while(i<args.length){
            System.out.print("elemento #"+i+": "+args[i]+"\n");
            i++;
        }

    }

    //funcion que usa el ciclo do-while
    public static void DoWhile(String[] args){

        int i=0;
        System.out.print("imprimiento los elementos en posicion PAR\n");
        do{
           
            if(i%2==0){
                System.out.print("elemento #"+i+": "+args[i]+"\n");
                
            }
            i++;

        }while(i<args.length);


    }

    //ciclo for 

    public static void CicloFor(String[] args){ 

        int i;
        //int t=args.length;

        for(i=args.length - 1; i >= 0; i--){

            System.out.print("elemmenot #"+i+": "+args[i]+"\n");
        }

    }

    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);
        String opc;
        //int opc;
        //String arreglo[]={"pepe","pecas","pica","papas"};

        System.out.print("ingrese en metodo que desee usar\n");
        System.out.print("1)While\n");
        System.out.print("2)DoWhile\n");
        System.out.print("3)For\n");
        System.out.print("opc: ");
        opc=entrada.nextLine();

        
        switch(opc){

            case "While": Cwhiile(args);break;

            case "DoWhile":  DoWhile(args);break;

            case "For": CicloFor(args);break;

            default: System.out.print("no hay un elemntos "+ opc + " intenete de nuevo\n");




        }

        entrada.close();







    }






}