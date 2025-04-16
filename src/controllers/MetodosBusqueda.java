package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }

    public int busquedaLineal(int[] arreglo, int num) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                return i;
            }
        }
        return -1;
    }
    
    public int findPersonByCode(int code) {
        for(int i = 0; i < people.length; i++ ) {
            if(code == people[i].getCode()) {
                return i;
            }
        }
        return -1;
        
    }

    public void showPerson() {
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con código: " + codeToFind + " encontrada.");
            showConsole.showMessage(people[indexPerson].toString());
            showConsole.showMessage(people[indexPerson] + ""); 
        } else {
            showConsole.showMessage("Persona no encontrada.");
        }
    }
}