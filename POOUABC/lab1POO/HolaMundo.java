public class HolaMundo { //definicion de la clase,por estandar la primera letra de la clase se escribe en maysucula 

    public static void main(String[] args){ //toda clase deberia de llevar si main. sin importar lo grande que sea.
        //main es el metodo que JVM busca para iniciar su ejecucion.
        	//System.out.println("hola mundo!");
            //static es porque no es necesario estanciarlo, solamente le decimos al jdk que solo lo ejecutre
            //cuando se compila es lo primero que ejecuta, ya que no es necesario instanciarlo.

            //(String[] args) esto sirve por si java necesita infromacion antes  
            System.out.println("elemento 1: "+ args[0]);
            System.out.println("elemento 2: "+ args[1]);
            System.out.println("elemento 3: "+ args[2]);

            
            
    }

}

/*
para poder compilar el programa que necesita usar la instruccion (javac nombre)

al ser main lo primero que se ejecuta en un porgrama, por logica no hay elemenots para instanciar, por eso debe ser static y publico, y como no hay ningun valor, el tipo de dato que sera nuestra clase main es de tipo void 



*/