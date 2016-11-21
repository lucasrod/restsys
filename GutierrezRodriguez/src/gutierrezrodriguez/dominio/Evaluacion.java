package gutierrezrodriguez.dominio;

public class Evaluacion {

    private int estrellas;
    private String resena;
    private String nombre;

    //PRE: -
    //POS: Retorna true sii la puntuación es un int entre 1 y 5
    private boolean esPuntuacionValida(int estrellas) {
        return (estrellas >= 1 && estrellas <= 5);
    }

    public Evaluacion() {
        this.estrellas = 0;
        this.resena = "";
        this.nombre = "";
    }

    public Evaluacion(int estrellas, String resena, String nombre) {
        if (esPuntuacionValida(estrellas)) {
            this.estrellas = estrellas;
        } else {
            this.estrellas = 0;
        }
        this.resena = resena;
        this.nombre = nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    //PRE: -
    //POS: (Ingresa la Puntuacion y retorna true) sii la puntuación es valida
    public boolean setEstrellas(int estrellas) {
        if (esPuntuacionValida(estrellas)) {
            this.estrellas = estrellas;
        }
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
    //POS: Retorna true sii (ni el nombre ni la reseña son vacíos) y es válida.
    public boolean esSorteable() {
        return !this.nombre.isEmpty() && !this.resena.isEmpty() && this.esValida();
    }

    //PRE: -
    //POS: Retorna true sii se le asigno un valor a las estrellas
    public boolean esValida() {
        return this.estrellas != 0;
    }
}
