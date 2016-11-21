package gutierrezrodriguez.dominio;

public class Ficha {
    private String nombre;
    private String direccion;
    String[] horarios; 
       
    //PRE: -
    //POS: Retorna true sii el día está entre 1 y 7
    private boolean esDia(int dia){
        return (dia>=1 && dia <=7);
    }
    
    public Ficha(){
        this.nombre = "";
        this.direccion = "";
        this.horarios = new String[8];
    }
    
    public Ficha(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Ficha(String nombre, String direccion, String[] horarios){
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarios = horarios;
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
        
    //PRE:  Recibe el n° de día (Lunes = 1, ..., Domingo = 7)
    //POS:  (Ingresa el horario del día y retorna true) sii es dia
    public boolean setHorario(int dia, String horarioDelDia){
        if(esDia(dia)){
            horarios[dia] = horarioDelDia;
        }
        return esDia(dia);
    }
}
