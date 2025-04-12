import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        scanner.close();
    }
}
