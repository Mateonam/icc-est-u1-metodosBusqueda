package controllers;
import models.Persona;
import views.ShowConsole;
public class MetodoDeBusquedaBinario {
    private Persona[] persona;
    private ShowConsole pantalla;

    public MetodoDeBusquedaBinario(Persona[] persona) {
        this.persona = persona;
        pantalla = new ShowConsole();
        pantalla.showMessage("*** Método de búsqueda binario ***");
    }

    private int findPersonByCode(int code) {
        int bajo = 0;
        int alto = persona.length - 1;
        while(alto >= bajo){
            int central = (alto + bajo) / 2;
            if(persona[central].getCode() == code) {
                return central;
            }

            if (persona[central].getCode() > code) {
                alto = central - 1;
            } else {
                bajo = central + 1;
            }
        }
        return -1;
    }

    public void showPersonByCode() {
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson == -1) {
            pantalla.showMessage("Persona con código: " + codeToFind + " no encontrada.");

        } else {
            pantalla.showMessage(persona[indexPerson].toString());
        }
    }

    public void showPersonByName(){
        String nameToFinde = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFinde);
        if(indexPerson == -1){
            pantalla.showMessage("Persona con nombre: " + nameToFinde + " no encontrada");
        }else{
            pantalla.showMessage("Persona con nombre: "+ nameToFinde + " encontrada");
            pantalla.showMessage(persona[indexPerson].toString());
        }
    }

    private static void orderBubbleSortName(Persona[] persona){
        int tamaño = persona.length;

        for (int i= 0; i < tamaño-1; i++){
            for (int j = 0; j < tamaño -1 -i; j++){
                if (persona[j].getName().compareToIgnoreCase(persona[j+1].getName()) > 0) {
                    Persona aux = persona[j];
                    persona[j]= persona[j+1];
                    persona[j+1]=  aux;
                }
            }
        }
    }
    
    private int findPersonByName(String name){
        int bajo = 0;
        int alto = persona.length -1;
        orderBubbleSortName(persona);

        while(alto>=bajo ){
            int central = (bajo + alto)/2;

            if(persona[central].getName().equals(name)){
                return central;
            }

            if(persona[central].getName().compareToIgnoreCase(name)>0){
                alto = central -1;
            }else{
                bajo = central +1;
            }
        }
        return -1;
    }

}
