package App;
import java.util.Scanner;

public interface Menus {
    Scanner leerConsola = new Scanner(System.in);

    public static int menuPrincipal(){
        int opcion = 0;
        System.out.println("******** BANCO ********");
        System.out.println("Opcion 1 => Ingresar");
        System.out.println("Opcion 2 => Ver lista");
        System.out.println("Opcion 3 => Buscar");
        System.out.println("Opcion 4 => Eliminar");
        System.out.println("Opcion 5 => Editar");
        System.out.println("Opcion 6 => SALIR");
        System.out.print("Ingrese una opcion => ");
        opcion = leerConsola.nextInt();
        return opcion;
    }

    static int tipoCuenta(){
        System.out.println("Tipo de Cuenta");
        System.out.println("1. Ahorros");
        System.out.println("2. Corriente");
        System.out.print("=> ");
        return leerConsola.nextInt();
    }

    static String buscar(){
        System.out.println("BUSCAR CUENTA");
        System.out.println("No.Cuenta/Cedula/Nombre");
        System.out.print("=> ");
        return leerConsola.next();
    }


}
