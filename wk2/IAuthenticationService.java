package cab302.wk2;

public interface IAuthenticationService {
    User signUp(String username, String password);
    User logIn(String username, String password);
}
