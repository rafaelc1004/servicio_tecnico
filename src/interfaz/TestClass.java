package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.CargaDatos;
import modelo.Clientes;
import modelo.Ejecutivos;
import modelo.Productos;
import modelo.Tickets;

public class TestClass {

    private static final ArrayList<Tickets> listaTicket = new ArrayList<>();
    private static Ejecutivos ejecutivoLogeado;
    private static int numTicket = 0;
    private static boolean numeric = true;
    private static byte opcion = 0;
    private static Productos productoProblema;
    private static Clientes clienteProblema;

    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private static int numeroTicket;
    private static boolean buscar = false;
    

    public static void main(String[] args) throws Exception {
        CargaDatos.cargarDatos();
        boolean estado = validarUsuario();

        if (estado == false) {
            System.out.println("Usuario y Password incorrectos!!");
            System.exit(0);
        } else {
            menu();
        }
    }

    //Valida el registro del ejecutivo que accedera al sistema
    private static boolean validarUsuario() throws IOException{
        
        

        System.out.print("Ingrese su usuario :");
        String usuario = bf.readLine();
        System.out.print("Ingrese su Password :");
        String pass = bf.readLine();

        for (Ejecutivos ejecutivo : CargaDatos.getListaEjecutivos()) {
            if (ejecutivo.getRut().equalsIgnoreCase(usuario) && ejecutivo.getPass().equalsIgnoreCase(pass)) {
                ejecutivoLogeado = ejecutivo;
                return true;
            }
        }

        return false;

    }

    //Menu inicio con las opciones a realizar
    private static void menu() throws IOException {

        System.out.println("\n\t\tIngrese Opcion de servicio a Realizar");
        System.out.println("\t\t-------------------------------------\n");
        System.out.println("\tMenu");
        System.out.println("\t----");
        System.out.println("1.- Ingresar Ticket de Reclamo");
        System.out.println("2.- Realizar Acualizacion de Ticket");
        System.out.println("3.- Informacion de Ticket");
        System.out.println("4.- Informacion Ejecutivo Especialista derivado");
        System.out.println("5.- Salir\n");
        do {
            opcion = validaOpcion();
            if (opcion > 5 || opcion < 1) {
                System.out.println("Opcion ingresada esta fuera de rango, intentelo nuevamente!");
                numeric = false;
            } else {
                numeric = true;
            }
        } while (numeric == false);
        
        opcionElegida(opcion);
    }
    
    
    //metodo que contiene switch con los diferentes metodos a realizar de menu
    private static void opcionElegida(byte opcion) throws IOException {

        switch (opcion) {
            case 1:
                ingresarTicket();
                break;
            case 2:
                actualizarTicket();
                break;
            case 3:
                informacionTicket();
                break;
            case 4:
                infoEspecialistaDerivado();
                break;
            default:
                System.exit(0);
        }
    }

    // metodo que hace el ingreso de un nuevo ticket
    private static void ingresarTicket() throws IOException {
        numTicket++;

        
        Date fechaTicket = Calendar.getInstance().getTime();
        System.out.println("\n\tElija Cliente");
        for (Clientes cliente : CargaDatos.getListaClientes()) {
            System.out.println(cliente.getId() + ".- " + cliente.getRut() + ", " + cliente.getNombre());

        }
        do {
            opcion = validaOpcion();
            if (opcion > CargaDatos.getListaClientes().size() || opcion < 1) {
                System.out.println("Opcion ingresada esta fuera de rango, intentelo nuevamente!");
                numeric = false;
            } else {
                numeric = true;
            }
        } while (numeric == false);
        for (Clientes cliente : CargaDatos.getListaClientes()) {
            if (cliente.getId() == opcion) {
                clienteProblema = cliente;
            }
        }

        System.out.println("\n\tSeleccione Producto Afectado\n");
        for (Productos producto : CargaDatos.getListaProductos()) {
            System.out.println(producto.getId() + ". - " + producto.getNombreProducto());
        }

        do {
            opcion = validaOpcion();
            if (opcion > CargaDatos.getListaProductos().size() || opcion < 1) {
                System.out.println("Opcion ingresada esta fuera de rango, intentelo nuevamente!");
                numeric = false;
            } else {
                numeric = true;
            }
        } while (numeric == false);
        for (Productos producto : CargaDatos.getListaProductos()) {
            if (producto.getId() == opcion) {
                productoProblema = producto;
            }
        }
        
        System.out.print("Describa el Problema :");
        String problema = bf.readLine();
        String estadoProblema = "Abierto";

        listaTicket.add(new Tickets(numTicket, fechaTicket, problema, "Sin solucion aun", estadoProblema, null, clienteProblema, productoProblema, ejecutivoLogeado));
        System.out.println("Ticket Generado Correcamente");
        System.out.println("\nPara volver al menu inicio presione enter.");
        bf.readLine();
        menu();
    }

    private static byte validaOpcion() {
        boolean estado;
        do {
            try {
                System.out.print("Ingrese Opcion :");
                opcion = Byte.parseByte(bf.readLine());
                estado = true;
            } catch (IOException | NumberFormatException e) {
                estado = false;
                System.out.println("Opcion Ingresada no es Valida!!");

            }
        } while (estado == false);
        return opcion;
    }

    private static void informacionTicket() throws IOException {
        do {
            try {
                System.out.print("Ingrese numero de Ticket a Consultar :\n");
                numeroTicket = Integer.parseInt(bf.readLine());
                numeric = true;
            } catch (IOException | NumberFormatException e) {
                numeric = false;
                System.out.println("Valor ingresado no es numerico, intentelo nuevamente!");
            }
        } while (numeric == false);
        for (Tickets ticket : listaTicket) {
            if (ticket.getNumTicket() == numeroTicket) {
                System.out.println("\n\t\tInformacion de Ticket");
                System.out.println("\t\t---------------------");
                System.out.println("Numero de ticket                          :" + ticket.getNumTicket());
                System.out.println("Rut de Cliente                            :" + ticket.getCliente().getRut());
                System.out.println("Nombre de Cliente                         :" + ticket.getCliente().getNombre());
                System.out.println("Fecha y hora de la llamada                :" + ticket.getFecha());
                System.out.println("Producto Afectado                         :" + ticket.getProducto().getNombreProducto());
                System.out.println("Asistente que lo Atendio                  :" + ticket.getEjecutivo().getNombre());
                System.out.println("Estado del Problema                       :" + ticket.getEstado());
                if (ticket.getEstado().equalsIgnoreCase("cerrado")) {
                    System.out.println("Solucion del Problema                     :" + ticket.getSolucion());
                } else if (ticket.getEstado().equalsIgnoreCase("derivado")) {
                    System.out.println("Especialista al que se deriva el caso     :" + ticket.getEspecialista().getNombre());
                }
                buscar = true;
                break;
            } else {
                buscar = false;
            }
        }
        if (buscar == false) {
            System.out.println("No se encontro un ticket de reclamo con el numero dado");
            menu();
        }
        System.out.println("\nPara volver al menu inicio presione enter");
        bf.readLine();
        menu();

    }

    private static void actualizarTicket() throws IOException {
        int contEspecialistas =1;
        ArrayList<Ejecutivos> listaEspecialistas = new ArrayList<>();
        do {
            try {
                System.out.print("Ingrese numero de Ticket a Actualizar :");
                numeroTicket = Integer.parseInt(bf.readLine());
                numeric = true;
            } catch (IOException | NumberFormatException e) {
                numeric = false;
                System.out.println("Valor ingresado no es numerico, intentelo nuevamente!");
            }
        } while (numeric == false);
        for (Tickets ticket : listaTicket) {
            if (ticket.getNumTicket() == numeroTicket) {
                System.out.println("\tActualizar estado");
                System.out.println("1.- Cerrar caso");
                System.out.println("2.- Derivar caso a un Especialista");
                do {
                    opcion = validaOpcion();
                    if (opcion > 2 || opcion < 1) {
                        System.out.println("Opcion ingresada esta fuera de rango, intentelo nuevamente!");
                        numeric = false;
                    } else {
                        numeric = true;
                    }
                } while (numeric == false);
                
                if(opcion == 1){
                    ticket.setEstado("Cerrado");
                    ticket.setSolucion(bf.readLine());
                }else{
                    ticket.setEstado("Derivado");
                    System.out.println("Elija Especialista");
                    for(Ejecutivos ejecutivo : CargaDatos.getListaEjecutivos()){
                        if(ejecutivo.getTipo()=='E'){
                            System.out.println(contEspecialistas+".- "+ejecutivo.getRut()+", "+ejecutivo.getNombre());
                            contEspecialistas++;
                            listaEspecialistas.add(ejecutivo);
                            
                        }
                    }
                    do{
                        opcion = validaOpcion();
                        numeric = !(opcion > contEspecialistas || opcion < 1);
                    }while(numeric == false);
                    for(int i =0; i<listaEspecialistas.size(); i++){
                        if((opcion -1) == i){   
                            ticket.setEspecialista(listaEspecialistas.get(i));
                            break;
                        }
                    }
                    
                }
                System.out.println("Estado de caso Actualizado");
                buscar = true;
                break;
            }else{
                buscar = false;
            }
        
        }
        if(buscar == false){
            System.out.println("Numero de ticket ingresado no Existe!");

        }
        System.out.println("Para volver al menu inicio presione enter");
        bf.readLine();
        menu();
    }

    private static void infoEspecialistaDerivado() throws IOException {
        do {
            try {
                System.out.print("Ingrese numero de Ticket a Actualizar :");
                numeroTicket = Integer.parseInt(bf.readLine());
                numeric = true;
            } catch (IOException | NumberFormatException e) {
              
                numeric = false;
                System.out.println("Valor ingresado no es numerico, intentelo nuevamente!");
            }
        } while (numeric == false);
        for (Tickets ticket : listaTicket) {
            if (ticket.getNumTicket()== numeroTicket) {
                if(ticket.getEstado().equalsIgnoreCase("Derivado")){
            
                System.out.println("Numero de Ticket :"+ticket.getNumTicket());
                System.out.println("Problema :"+ticket.getProblema());
                System.out.println("Rut especialista derivado :"+ticket.getEspecialista().getRut());
                System.out.println("Nombre de especialista derivado :"+ticket.getEspecialista().getNombre());
                }else if(ticket.getEstado().equalsIgnoreCase("Abierto")){
                    System.out.println("Aun no ha sido derivado a un Especialista");
                }
                buscar = true;
                break;
            }else{
                buscar = false;
            }
        }
        if(buscar == false){
            System.out.println("No se encontro un caso asociado a este numero de ticket");
        }
        System.out.println("Para volver al menu inicio presione enter");
        bf.readLine();
        menu();
    }

}
