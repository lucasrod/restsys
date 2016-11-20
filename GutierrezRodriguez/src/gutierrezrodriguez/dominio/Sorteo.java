package gutierrezrodriguez.dominio;

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
        this.restaurante = restaurante;
        this.setNumeroDeGanadores(numeroDeGanadores);
        this.premio = premio;
    }

    public int getNumeroDeGanadores() {
        return numeroDeGanadores;
    }

    public void setNumeroDeGanadores(int numeroDeGanadores) {
        this.numeroDeGanadores = (numeroDeGanadores > 0 && 
                numeroDeGanadores < restaurante.getEvaluacionesSorteables().size() ?
                numeroDeGanadores : 1);
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
}
