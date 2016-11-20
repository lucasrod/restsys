package gutierrezrodriguez.dominio;

public class Ficha {
    private String nombre;
    private String direccion;
    String[] horarios; 
    
    Ficha(){
        this.nombre = "";
        this.direccion = "";
        this.horarios = new String[7];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
