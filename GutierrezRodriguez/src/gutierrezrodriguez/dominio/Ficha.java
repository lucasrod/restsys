package gutierrezrodriguez.dominio;
import java.util.*;

public class Ficha {
    private String nombre;
    private String direccion;
    private ArrayList<String> horarios; //falta getter y setter
    
    Ficha(){
        this.nombre = "";
        this.direccion = "";
        this.horarios = new ArrayList<String>();
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
