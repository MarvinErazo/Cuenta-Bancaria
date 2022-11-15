package AccesoDatos;

import App.Menus;
import Banco.Cuenta;

import java.util.ArrayList;

public class Operaciones <T>{
    private ArrayList<T> lista = new ArrayList<T>();

    public Operaciones(){

    }

    private ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    public void insertar(T dato){
        getLista().add(dato);
    }

    public void mostrar(){
        for(T dato : getLista())
            System.out.println(dato.toString());
    }

    public T buscar (String dato){
        for(T cuenta : getLista()){
            if(cuenta.toString().contains(dato)){
                return cuenta;
            }
        }
        return null;
    }

    public void eliminar(String dato){
        T elemento = buscar(dato);
        if(elemento != null){
            getLista().remove(elemento);
        }
        else
            System.out.println("No se pudo eliminar");
    }
    
    public void editar(T dato, T nuevo){
        getLista().set(getLista().indexOf(dato),nuevo);
    }

}
