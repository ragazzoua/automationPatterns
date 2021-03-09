package dependencyinjection;

public class LoginDataFake implements LoginData{
    public String getUserName() {
        return "Fake user";
    }

    public String getPassword() {
        return "Fake password";
    }
}
