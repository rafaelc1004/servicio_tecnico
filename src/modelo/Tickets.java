
package modelo;


import java.util.Calendar;
import java.util.Date;

public class Tickets {
    
    private int numTicket;
    private Date fecha;
    private String problema;
    private String solucion;
    private String estado;
    private Ejecutivos especialista;
    private Clientes cliente;
    private Productos producto;
    private Ejecutivos ejecutivo;

    public Tickets(int numTicket, Date fecha, String problema, String solucion, String estado, Ejecutivos especialista, Clientes cliente, Productos producto, Ejecutivos ejecutivo) {
        this.numTicket = numTicket;
        this.fecha = fecha;
        this.problema = problema;
        this.solucion = solucion;
        this.estado = estado;
        this.especialista = especialista;
        this.cliente = cliente;
        this.producto = producto;
        this.ejecutivo = ejecutivo;
    }

        public Tickets(int numTicket, Date fecha, String problema, String estado, Clientes cliente, Productos producto, Ejecutivos ejecutivo) {
        this.numTicket = numTicket;
        this.fecha = fecha;
        this.problema = problema;
        this.estado = estado;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Ejecutivos getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Ejecutivos especialista) {
        this.especialista = especialista;
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
