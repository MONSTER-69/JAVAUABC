
package entradascanner;

import java.util.Scanner;



public class EntradaScanner {

    public static void Cwhiile(String[] args){

        int i=0;
        while(i<args.length){
            System.out.print("elemento #"+i+": "+args[i]+"\n");
            i++;
        }

    }

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        String opc;
        //int opc;
        //String arreglo[]={"pepe","pecas","pica","papas"};

        System.out.print("ingrese en metodo que desee usar\n");
        System.out.print("1)While\n");
        System.out.print("2)D0-while\n");
        System.out.print("3)For\n");
        opc=entrada.nextLine();

        
        switch(opc){

            case "While": Cwhiile(args);break;




        }

        entrada.close();
        
        
    }
    
}
