package views;

import java.util.Scanner;

public class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner() {
        System.out.println("*** Métodos de Búsqueda ***");
    }

    public int inputCode() {
        System.out.print("Ingrese un código: ");
        int code = scanner.nextInt();
        return code;
    }

    public String inputName() {
        System.out.print("Ingrese el nombre de la persona: ");
        String name = scanner.nextLine();
        return name;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

}
