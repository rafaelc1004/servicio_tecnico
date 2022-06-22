/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;


public class CargaDatos {
    
    private static List<Clientes> listaClientes = new ArrayList<>();
    private static List<Ejecutivos> listaEjecutivos = new ArrayList<>();
    private static List<Productos> listaProductos =  new ArrayList<>();

   
    
    // Carga de datos de clientes Ejecutivos y Productos
    public static void cargarDatos() {
        listaClientes.add(new Clientes(1, "10111111-1", "jose", "986854231", "jose@gmail.com"));
        listaClientes.add(new Clientes(2, "20222222-2", "claudio", "958623946", "claudio@gmail.com"));
        listaClientes.add(new Clientes(3, "30333333-3", "antonia", "925684367", "antonia@gmail.com"));
        listaClientes.add(new Clientes(4, "40444444-4", "Miguel", "958692436", "miguel@gmail.com"));
        listaClientes.add(new Clientes(5, "50555555-5", "anastasia", "957962436", "anastasia@gmail.com"));

        listaEjecutivos.add(new Ejecutivos(1, "Sebastian", "11000000-1", 'N', "123"));
        listaEjecutivos.add(new Ejecutivos(2, "Javier", "22000000-2", 'E', "456"));
        listaEjecutivos.add(new Ejecutivos(3, "Josue", "33000000-3", 'N', "789"));
        listaEjecutivos.add(new Ejecutivos(4, "Miguel", "44000000-4", 'E', "359"));


        listaProductos.add(new Productos(1, "fibra 300"));
        listaProductos.add(new Productos(2, "fibra 600"));
        listaProductos.add(new Productos(3, "fibra 900"));
        listaProductos.add(new Productos(4, "movil 100"));
        listaProductos.add(new Productos(5, "movil 200"));
        listaProductos.add(new Productos(6, "movil 300"));

        System.out.println("Datos Cargados Correctamente!");
    }

    public static List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public  void setListaClientes(List<Clientes> listaClientes) {
        CargaDatos.listaClientes = listaClientes;
    }

    public static List<Ejecutivos> getListaEjecutivos() {
        return listaEjecutivos;
    }

    public static void setListaEjecutivos(List<Ejecutivos> listaEjecutivos) {
        CargaDatos.listaEjecutivos = listaEjecutivos;
    }

    public static List<Productos> getListaProductos() {
        return listaProductos;
    }

    public static void setListaProductos(List<Productos> listaProductos) {
        CargaDatos.listaProductos = listaProductos;
    }
    
    

}
