package RA5.exercici6.P2;

public class Cotxe {
    public String encendre(){
        Motor m = new Motor();
        boolean encendido = m.arrancar();
        return "cotxe operatiu";
    }
}
