package RA5.exercici6.P4;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users = new ArrayList<User>();

    public User cerca(String correu) {
        for(User u:users){
            if (u.correu.equals(correu)){
                return u;
            }
        }
        return null;
    }
}
