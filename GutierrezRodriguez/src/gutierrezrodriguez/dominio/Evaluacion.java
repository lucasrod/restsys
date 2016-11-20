package gutierrezrodriguez.dominio;

public class Evaluacion {
    private int estrellas;
    private String resena;
    private String nombre;
    
    public Evaluacion(){
        this.estrellas = 0;
        this.resena = "";
        this.nombre = "";
    }
    
    public Evaluacion(int estrellas, String resena){
        this.estrellas = estrellas;
        this.resena = resena;
    }
    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean esSorteable(){
        return !this.nombre.isEmpty() && !this.resena.isEmpty();
    }
    
    public boolean esValida(){
        return this.estrellas != 0;
    }
}
