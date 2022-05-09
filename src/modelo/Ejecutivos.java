
package modelo;


public class Ejecutivos {
    
    private int id;
    private String nombre;
    private String rut;
    private char tipo;
    private String pass;

    public Ejecutivos(int id, String nombre, String rut, char tipo, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.tipo = tipo;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
}
