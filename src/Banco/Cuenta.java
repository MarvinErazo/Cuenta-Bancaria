package Banco;

import java.util.Scanner;

public abstract class Cuenta {
    private String numero;
    private Titular propietario;
    private float saldo;

    public Cuenta(){
        ingresarCuenta();
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Titular getPropietario() {
        return propietario;
    }
    public void setPropietario(Titular propietario) {
        this.propietario = propietario;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "========= CUENTA: " + getNumero() + " =========\n" +
                getPropietario().toString() +
                "Saldo: " + getSaldo();
    }
    protected void ingresarDatosCuenta(){
        Titular aux = new Titular();
        Scanner ingreso = new Scanner(System.in);

        System.out.println("-------INGRESO DE DATOS DE CUENTA-------");
        aux.ingresarTitular();
        setPropietario(aux);

        System.out.print("Numero de cuenta => ");
        setNumero(ingreso.nextLine());

        System.out.print("Saldo inicial => ");
        setSaldo(ingreso.nextFloat());
    }

    public abstract void ingresarCuenta();

    protected abstract void sumarCuenta ();
}