package Banco;

import java.util.Scanner;

public class Ahorros extends Cuenta {
    private float interes;

    public Ahorros(){}

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
    public void ingresarCuenta(){
        ingresarDatosCuenta();
        Scanner leer = new Scanner(System.in);
        System.out.print("Interes => ");
        setInteres(leer.nextFloat());
        sumarCuenta();
    }
    protected void sumarCuenta(){
        setSaldo(getSaldo() - (getSaldo() * (getInteres()/100)));
    }
}