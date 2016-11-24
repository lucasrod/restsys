package gutierrezrodriguez.dominio;

import java.util.ArrayList;

public class Sistema {

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    private Restaurante restaurante;
    private ArrayList<Cliente> clientes;

    public Sistema() {
        this.restaurante = new Restaurante();
        this.clientes = new ArrayList<>();
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    public void cargarDatosDePrueba(){
        for (int i = 1; i <= 50; i++) {
            Evaluacion evaluacion = new Evaluacion(1, "Reseña " + i, new Cliente("Juan Pedro " + i, "jotape_" + i + "@gmail.com"));
            restaurante.setEvaluacion(evaluacion);
        }
        for(int i=1; i<=50; i++){
            Sorteo sorteo = new Sorteo(i, "Premio"+i, restaurante);
            restaurante.setSorteo(sorteo);
        }
        Ficha ficha = new Ficha("Dakota", "21 de Setiembre esq. Luis de La Torre");
        restaurante.setFicha(ficha);
    }

    public void setClientes(Cliente cliente) {
        clientes.add(cliente);
    }
}
