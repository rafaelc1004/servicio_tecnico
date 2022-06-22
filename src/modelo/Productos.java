
package modelo;


public class Productos {
    
    private int id;
    private String nombreProducto;

    public Productos(int id, String nombreProducto) {
        this.id = id;
        this.nombreProducto = nombreProducto;
    }
    
    public Productos(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

   
}
