package gutierrezrodriguez.dominio;

import java.util.ArrayList;

public class Sistema {

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

    public void setClientes(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void cargarDatosDePrueba() {
        Cliente cliente1 = new Cliente("Matías Gutierrez", "matias.gutierrez@hotmail.com");
        Evaluacion evaluacion = new Evaluacion(2, "Muy bueno", cliente1);
        restaurante.setEvaluacion(evaluacion);
        this.setClientes(cliente1);

        Cliente cliente2 = new Cliente("Lucas Rodriguez", "lucas.rodrguez@outlook.com");
        Evaluacion evaluacion2 = new Evaluacion(4, "Tremendo", cliente2);
        restaurante.setEvaluacion(evaluacion2);
        this.setClientes(cliente2);

        Cliente cliente3 = new Cliente("Federico Abreu", "federico.abreu@yahoo.com");
        Evaluacion evaluacion3 = new Evaluacion(3, "Bien de bien", cliente3);
        restaurante.setEvaluacion(evaluacion3);
        this.setClientes(cliente3);

        Cliente cliente4 = new Cliente("Paula Ons", "paula.ons@aol.com");
        Evaluacion evaluacion4 = new Evaluacion(5, "Excelente", cliente4);
        restaurante.setEvaluacion(evaluacion4);
        this.setClientes(cliente4);

        Cliente cliente5 = new Cliente("Andrea Erpi", "andrea.erpi@gmail.com");
        Evaluacion evaluacion5 = new Evaluacion(1, "Horrible", cliente5);
        restaurante.setEvaluacion(evaluacion5);
        this.setClientes(cliente5);

        Sorteo sorteo1 = new Sorteo(1, "Play Station 4", restaurante);
        restaurante.setSorteo(sorteo1);

        Sorteo sorteo2 = new Sorteo(1, "Cena para dos personas", restaurante);
        restaurante.setSorteo(sorteo2);

        Sorteo sorteo3 = new Sorteo(3, "Pasajes dobles para el caribe", restaurante);
        restaurante.setSorteo(sorteo3);

        Ficha ficha = new Ficha("Dakota", "21 de Setiembre esq. Luis de La Torre");
        restaurante.setFicha(ficha);
    }

}
