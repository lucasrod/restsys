package gutierrezrodriguez.dominio;
import java.util.Random;

import java.util.ArrayList;

public final class Sorteo {
    int numeroDeGanadores;
    String premio;
    Restaurante restaurante;
    
    public Sorteo(){
        this.numeroDeGanadores = 1;
        this.premio = "";
        this.restaurante = new Restaurante();
    }
    
    public Sorteo(int numeroDeGanadores, String premio, Restaurante restaurante){   
        this.setNumeroDeGanadores(numeroDeGanadores);
        this.premio = premio;
        this.restaurante = restaurante;
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
    
    public ArrayList<Evaluacion> realizarSorteo(){
        
        ArrayList<Evaluacion> retorno = new ArrayList<Evaluacion>();
        ArrayList<Evaluacion> sorteables = restaurante.getEvaluacionesSorteables();
        ArrayList<Integer> elegidos = new ArrayList<Integer>();
        int numeroSorteado = 0;
        if(numeroDeGanadores > sorteables.size()) numeroDeGanadores = sorteables.size();
        for(int i = 0; i < numeroDeGanadores; i++){
          do{
            Random random = new Random();
            int randomNum = random.nextInt((sorteables.size() - 1) + 1);
            numeroSorteado = randomNum;
          }while(elegidos.contains(numeroSorteado));
          retorno.add(sorteables.get(numeroSorteado));
          elegidos.add(numeroSorteado);
        }
        return retorno;
    }
}
