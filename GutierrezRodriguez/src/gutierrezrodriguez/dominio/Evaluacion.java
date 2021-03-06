package gutierrezrodriguez.dominio;

public final class Evaluacion {

    private int estrellas;
    private String resena;
    private Cliente cliente;
    
    //PRE: -
    //POS: Retorna true sii la puntuación es un int entre 1 y 5
    private boolean esPuntuacionValida(int estrellas) {
        return (estrellas >= 1 && estrellas <= 5);
    }

    public Evaluacion() {
        this.estrellas = 0;
        this.resena = "";
        this.cliente = new Cliente();
    }
    
    public Evaluacion(int estrellas, String resena, Cliente cliente) {
        if (esPuntuacionValida(estrellas)) {
            this.estrellas = estrellas;
        } else {
            this.estrellas = 0;
        }
        this.resena = resena;
        this.setCliente(cliente);
    }

    public Evaluacion(int estrellas, String resena, String nombre, String mail) {
        if (esPuntuacionValida(estrellas)) {
            this.estrellas = estrellas;
        } else {
            this.estrellas = 0;
        }
        this.resena = resena;
        this.cliente = new Cliente(nombre, mail);
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
    
    //PRE: -
    //POS: Retorna true sii (ni el nombre ni la reseña son vacíos) y es válida.
    public boolean esSorteable() {
        return !this.cliente.getNombre().isEmpty() && !this.resena.isEmpty() && this.esValida();
    }

    //PRE: -
    //POS: Retorna true sii se le asigno un valor a las estrellas
    public boolean esValida() {
        return this.estrellas != 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}