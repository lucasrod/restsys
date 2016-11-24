package gutierrezrodriguez.dominio;

public class Cliente {

    private String nombre;
    private String mail;

    Cliente() {
        this.nombre = "";
        this.mail = "";
    }

    @Override
    public String toString() {
        return getNombre();
    }

    public Cliente(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
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
}
