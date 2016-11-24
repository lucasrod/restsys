package gutierrezrodriguez.dominio;

import java.util.Random;

import java.util.ArrayList;
import java.util.function.Predicate;

public final class Sorteo {

    int numeroDeGanadores;
    String premio;
    Restaurante restaurante;
    private boolean realizado;
    ArrayList<Cliente> ganadores;

    public Sorteo() {
        this.numeroDeGanadores = 1;
        this.premio = "";
        this.restaurante = new Restaurante();
        this.realizado = false;
        this.ganadores = new ArrayList<>();
    }

    public Sorteo(int numeroDeGanadores, String premio, Restaurante restaurante) {
        this.setNumeroDeGanadores(numeroDeGanadores);
        this.premio = premio;
        this.restaurante = restaurante;
        this.realizado = false;
        this.ganadores = new ArrayList<Cliente>();
    }

    public int getNumeroDeGanadores() {
        return numeroDeGanadores;
    }

    //PRE: Debe estar seteado el restaurante de la clase
    //POS: Retorna true y setea el numero de ganadores a un valor dado distinto de 1 
    //sii el numero de ganadores es mayor a cero y menor al numero de evaluaciones sorteables
    public boolean setNumeroDeGanadores(int numeroDeGanadores) {
        this.numeroDeGanadores = (numeroDeGanadores > 0 ? numeroDeGanadores : 1);
        return (numeroDeGanadores > 0);
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    //PRE: -
    //POS: Retorna true sii el sorteo fue realizado.
    public boolean isRealizado() {
        return this.realizado;
    }

    //PRE: El sorteo fue realizado 
    //POS: Retorna un ArrayList<Evaluaciones> que representan los ganadores del sorteo
    public ArrayList<Cliente> getGanadores() {
        return this.ganadores;
    }

    public ArrayList<Cliente> realizarSorteo() {
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();
        if (!this.isRealizado()) {
            ArrayList<Evaluacion> sorteables = restaurante.getEvaluacionesSorteables();
            ArrayList<Integer> elegidos = new ArrayList<Integer>();
            int numeroSorteado = 0;

            //Si el numero de ganadores supera el de las evaluaciones sorteables se iguala para hacerlo posible
            if (numeroDeGanadores > sorteables.size()) {
                numeroDeGanadores = sorteables.size();
            }

            //for que se utiliza para elegir la cantidad de ganadores correspondiente
            for (int i = 0; i < numeroDeGanadores; i++) {

                //Se busca un numero aleatorio hasata que sea diferente a los que salieron previamente
                do {
                    Random random = new Random();
                    numeroSorteado = random.nextInt(sorteables.size());
                } while (elegidos.contains(numeroSorteado));

                //Se agrega el nuevo ganador al retorno
                retorno.add(sorteables.get(numeroSorteado).getCliente());

                //Se agrega el numero ganador a la lista de los que ya salieron para evitar que se repita
                elegidos.add(numeroSorteado);

            }
            realizado = true;
        }
        return retorno;
    }

    public static Predicate<Sorteo> fueRealizado() {
        return p -> p.isRealizado();
    }

    @Override
    public String toString() {
        int cantGanadores = getNumeroDeGanadores();
        return (cantGanadores == 1 ? premio : cantGanadores + " " + premio);
    }
}
