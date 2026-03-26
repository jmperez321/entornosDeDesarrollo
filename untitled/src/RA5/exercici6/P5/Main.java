package RA5.exercici6.P5;

public class Main {
    public static void main() {
        Tui t = new Tui();
        Controller c = new Controller();
        t.menuInicio();
        int opcion = t.opcionMenuPrinc();
        if (opcion==1){
            newCrearContacto(c,t);
        } else if (opcion==2) {
            t.mostrarContactos(c,t);
        }else {
            t.printError();
        }
    }
    public static void newCrearContacto(Controller c, Tui t){
        //Crear contacto
    }


}
