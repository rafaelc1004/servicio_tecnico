
package modelo;

import java.time.LocalDate;

public class Tickets {
    
    private int numTicket;
    private LocalDate fecha;
    private String problema;
    private String solucion;
    private Clientes cliente;
    private Productos producto;
    private Ejecutivos ejecutivo;

    public Tickets(int numTicket, LocalDate fecha, String problema, String solucion, Clientes cliente, Productos producto, Ejecutivos ejecutivo) {
        this.numTicket = numTicket;
        this.fecha = fecha;
        this.problema = problema;
        this.solucion = solucion;
        this.cliente = cliente;
        this.producto = producto;
        this.ejecutivo = ejecutivo;
    }
    
    public Tickets(){
        
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public Ejecutivos getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(Ejecutivos ejecutivo) {
        this.ejecutivo = ejecutivo;
    }
    
    
    
}
