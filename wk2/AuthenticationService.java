package cab302.wk2;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService{
    private ArrayList<User> users;
    public AuthenticationService(){
        users.add(new User("test", "test"));
    }

    @Override
    public User signUp(String username, String password) {
        Iterator i = users.iterator();
        while(i.hasNext()){
            User existsAlready = (User) i.next();
            if(existsAlready.getUsername().equals(username)){
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    @Override
    public User logIn(String username, String password) {
        Iterator i = users.iterator();
        while(i.hasNext()){
            User user = (User) i.next();
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
