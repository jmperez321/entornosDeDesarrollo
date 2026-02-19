package RA5.exercici1;

public class Pacient {
    private String nom;
    private String cognom;
    private String naixament;
    private String dni;
    private int genere;
    private float altura;
    private float peso;
    private String[] allergies;
    private String[] medicacio;
    private String[] malalties;
    private String[] operacions;

    public float calImc(float altura, float peso){
             float imc = peso / altura;
        return imc;
    }
}

