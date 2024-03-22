import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private String username;
    private String passwd;
    private String nalog;

    public Account(String username, String passwd, String nalog) {
        this.username = username;
        this.passwd = passwd;
        this.nalog = nalog;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNalog() {
        return nalog;
    }

    public void setNalog(String nalog) {
        this.nalog = nalog;
    }
    public void nalogInfo(){
        System.out.println("Nalog: " + this.nalog + " Username: " + this.username + " Password: " + this.passwd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(getUsername(), account.getUsername()) && Objects.equals(getPasswd(), account.getPasswd()) && Objects.equals(getNalog(), account.getNalog());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPasswd(), getNalog());
    }
}
