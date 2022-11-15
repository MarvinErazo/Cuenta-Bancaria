package Banco;

import java.util.Scanner;

public class Corriente extends Cuenta{
    private float mantenimiento;

    public Corriente() {}

    public float getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(float mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public void ingresarCuenta(){
        ingresarDatosCuenta();
        Scanner leer = new Scanner(System.in);
        System.out.print("Coste de mantenimiento => ");
        setMantenimiento(leer.nextFloat());
        sumarCuenta();
    }

    protected void sumarCuenta(){
        setSaldo(getSaldo() - getMantenimiento());
    }
}
