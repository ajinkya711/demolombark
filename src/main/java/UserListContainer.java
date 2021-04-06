import org.apache.catalina.User;

import java.util.List;

public class UserListContainer {

    private List<User> users;

    public List<User> getUsers(){
        return users;
    }

    public void setUsers(List<User> users){
        this.users=users;
    }
}
