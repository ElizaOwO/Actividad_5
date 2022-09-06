
//Importar libreria de la clase
//Scanner para leer la entrada de datos
import java.util.Scanner;

//Clase Operaciones
public class Operaciones {
    //Clase principal
    public static void main (String [] arg){

        //Declarar variables
        float x, y;
        //Instancia de la clase Scanner
        Scanner sc= new Scanner (System.in);

        //Textos para pedir los números
        System.out.print("Ingresa el 1er númerowo: ");
        x = sc.nextFloat();
        System.out.print("Ingresa el 2do númerowo: ");
        y = sc.nextFloat();

        //Realizar e imprimir resultados de las operaciones
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("X= " + x + "\n" + "Y= " + y);
        System.out.println("Suma= " + (x+y));
        System.out.println("Resta= " + (x-y));
        System.out.println("División= " + (x/y));
        System.out.println("Módulo= " + (x%y));
    }
}
