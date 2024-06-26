package dio.web.api.model;

public class Usuario {

    private String id;
    private String login;
    private String password;
    public Usuario(){}

    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + login + ", password=" + password + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
