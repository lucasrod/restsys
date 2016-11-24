package gutierrezrodriguez.dominio;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String mail;
    private ArrayList <Sorteo> sorteosGanados;

    public Cliente() {
        this.nombre = "";
        this.mail = "";
        this.sorteosGanados = new ArrayList<>();
    }

    @Override
    public String toString() {
        return nombre.isEmpty()? "[Anónimo]" : getNombre();
    }

    public Cliente(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
        this.sorteosGanados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList <Sorteo> getSorteosGanados() {
        return sorteosGanados;
    }

    public void setSorteosGanados(Sorteo sorteo) {
        this.sorteosGanados.add(sorteo);
    }
}
