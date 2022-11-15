package AccesoDatos;

import App.Menus;
import Banco.Ahorros;
import Banco.Corriente;
import Banco.Cuenta;
import Banco.Titular;

public class OperacionesTitulares {
    private  Operaciones<Titular> titulares = new Operaciones<Titular>();

    public OperacionesTitulares(){
        int opcion;

        do{
            opcion = Menus.menuPrincipal();
            switch (opcion){
                case 1:
                    titulares.insertar(new Titular());
                    break;
                case 2:
                    titulares.mostrar();
                    break;
                case 3:
                    System.out.println(titulares.buscar(Menus.buscar()));
                    break;
                case 4:
                    titulares.eliminar(Menus.buscar());
                    break;
                case 5:
                    Titular titular = titulares.buscar(Menus.buscar());
                    if(titular != null){
                        titulares.editar(titular, new Titular());
                    }
                    break;
            }
        }while (opcion != 6);
    }
}
