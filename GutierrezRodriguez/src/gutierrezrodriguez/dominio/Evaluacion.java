package gutierrezrodriguez.dominio;

public class Evaluacion {
    private int estrellas;
    private String resena;
    private String nombre;
    
    //PRE: -
    //POS: Retorna true sii la puntuación es un int entre 1 y 5
    private boolean esPuntuacionValida(int estrellas){
        boolean esPuntuacionValida;
        try{
            esPuntuacionValida = (estrellas >=1 && estrellas <=5);
        }catch(Exception e){
            esPuntuacionValida = false;
        }
        return esPuntuacionValida;
    }
    
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

    //PRE: -
    //POS: (Ingresa la Puntuacion y retorna true) sii la puntuación es valida
    public boolean setEstrellas(int estrellas) {
        if(esPuntuacionValida(estrellas))
            this.estrellas = estrellas;
        return esPuntuacionValida(estrellas);
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
    
    //PRE: -
    //POS: Retorna true sii es sorteable
    public boolean esSorteable(){
        return !this.nombre.isEmpty() && !this.resena.isEmpty();
    }
    
    //PRE: -
    //POS: Retorna true sii se le asigno un valor a las estrellas
    public boolean esValida(){
        return this.estrellas != 0;
    }
}
