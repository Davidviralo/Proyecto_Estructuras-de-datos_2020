package data;

public class User {
    private String name;
    private int id;
    private String user;
    private String password;
    private int account;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public int getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setContraseña(String contrasena) {
        this.password = contrasena;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}