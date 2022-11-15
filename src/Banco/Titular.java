package Banco;

import java.util.Scanner;
public class Titular {
    private String cedula;
    private String nombre;

    public Titular(){
        this.setCedula("");
        this.setNombre("");
    }

    public Titular( String cedula, String nombre){
        this.setCedula(cedula);
        this.setNombre(nombre);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Titular => " + nombre + "\n" +
                "Cedula => " + cedula + "\n";
    }

    public void ingresarTitular() {
        System.out.println("Datos del titular");
        Scanner ingreso = new Scanner(System.in);

        System.out.print("\tNombre => ");
        setNombre(ingreso.nextLine());

        System.out.print("\tCedula => ");
        setCedula(ingreso.nextLine());
    }
}
