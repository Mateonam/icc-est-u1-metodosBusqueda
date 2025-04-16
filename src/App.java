import java.util.Scanner;

import controllers.MetodosBusqueda;
import models.Persona;

public class App {


    public static void main(String[] args) {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "María");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofía");
        personas[6] = new Persona(107, "Pedro");
        MetodosBusqueda mB = new MetodosBusqueda(personas);
        /*Scanner scanner = new Scanner(System.in);
        MetodosBusqueda mBusqueda = new MetodosBusqueda();

        int[] arreglo = {8, 11, 2, 10, 12, 1, 7, 30};
        System.out.print("Ingresa el número que deseas buscar: ");
        System.out.println("{8, 11, 2, 10, 12, 1, 7, 30}");
        int objetivo = scanner.nextInt();

        int resultado = mBusqueda.busquedaLineal(arreglo, objetivo);

        if (resultado != -1) {
            System.out.println("El número que desea buscar se encuentra en el índice: " + resultado);
        } else {
            System.out.println("El número que digitó no se encuentra en el arreglo.");
        }

        scanner.close();*/


    }
}
