package dependencyinjection;

public class LoginDataReal implements LoginData{
    public String getUserName() {
        return "Real user";
    }

    public String getPassword() {
        return "Real password";
    }
}
