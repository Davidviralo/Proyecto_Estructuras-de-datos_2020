package data;

public class Usuario {
    private String nombre;
    private int id;
    private String usuario;
    private String contrasena;
    private int cuenta;

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}