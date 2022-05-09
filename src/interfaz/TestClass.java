package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modelo.Clientes;
import modelo.Ejecutivos;
import modelo.Productos;
import modelo.Tickets;

public class TestClass {

    private static ArrayList<Clientes> listaClientes = new ArrayList<>();
    private static ArrayList<Tickets> listaTicket = new ArrayList<>();
    private static ArrayList<Productos> listaProductos = new ArrayList<>();
    private static ArrayList<Ejecutivos> listaEjecutivos = new ArrayList<>();
    private static Ejecutivos ejecutivoLogeado;

    public static void main(String[] args) throws Exception {
        cargarDatos();
        
        if (validarUsuario() == false) {
            System.out.println("Usuario y Password incorrectos!!");
            System.exit(0);
        }else{
            //menu();
        }
    }

    private static boolean validarUsuario() throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("\nIngrese su usuario :");
        String usuario = bf.readLine();
        System.out.print("\nIngrese su Password :");
        String pass = bf.readLine();

        for (Ejecutivos ejecutivo : listaEjecutivos) {
            if (ejecutivo.getRut().equalsIgnoreCase(usuario) && ejecutivo.getPass().equalsIgnoreCase(pass)) {
                ejecutivoLogeado = ejecutivo;
                return true;

            }
        }
        if (ejecutivoLogeado == null) {
            System.out.println("Usuario y Password incorrectos!!");
            System.exit(0);
        }
        return false;
        
    }
    

    private static void cargarDatos() {
        listaClientes.add(new Clientes(1, "10111111-1", "jose", "986854231", "jose@gmail.com"));
        listaClientes.add(new Clientes(2, "20222222-2", "claudio", "958623946", "claudio@gmail.com"));
        listaClientes.add(new Clientes(3, "30333333-3", "antonia", "925684367", "antonia@gmail.com"));
        listaClientes.add(new Clientes(4, "40444444-4", "Miguel", "958692436", "miguel@gmail.com"));
        listaClientes.add(new Clientes(5, "50555555-5", "anastasia", "957962436", "anastasia@gmail.com"));

        listaEjecutivos.add(new Ejecutivos(1, "11000000-1", "Sebastian", 'N', "123"));
        listaEjecutivos.add(new Ejecutivos(2, "22000000-2", "Javier", 'E', "456"));
        listaEjecutivos.add(new Ejecutivos(3, "33000000-3", "Josue", 'N', "789"));

        listaProductos.add(new Productos(1, "fibra 300"));
        listaProductos.add(new Productos(2, "fibra 600"));
        listaProductos.add(new Productos(3, "fibra 900"));
        listaProductos.add(new Productos(4, "movil 100"));
        listaProductos.add(new Productos(5, "movil 200"));
        listaProductos.add(new Productos(6, "movil 300"));
    }

}
