package AccesoDatos;

import App.Menus;
import Banco.Ahorros;
import Banco.Corriente;
import Banco.Cuenta;

public class OperacionesCuentas {
    private  Operaciones<Cuenta> cuentas = new Operaciones<Cuenta>();

    public OperacionesCuentas(){
        int opcion;

        do{
            opcion = Menus.menuPrincipal();
            switch (opcion){
                case 1:
                    cuentas.insertar(Menus.tipoCuenta() == 1 ? new Ahorros() : new Corriente());
                    break;
                case 2:
                    cuentas.mostrar();
                    break;
                case 3:
                    System.out.println(cuentas.buscar(Menus.buscar()));
                    break;
                case 4:
                    cuentas.eliminar(Menus.buscar());
                    break;
                case 5:
                    Cuenta cuenta = cuentas.buscar(Menus.buscar());
                    if(cuenta != null){
                        cuentas.editar(cuenta, cuenta.getClass() == Ahorros.class ? new Ahorros() : new Corriente());
                    }
                    break;
            }
        }while (opcion != 6);
    }
}
