package RA5.exercici1;

public class Fruteria {
    private int cantidad;
    private float coste;
    private float beneficio;

    public float calMargen(int cantidad, float coste, float beneficio){
        float res = (beneficio-coste)*cantidad;
        return res;
    }
}
