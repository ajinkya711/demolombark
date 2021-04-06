import org.apache.catalina.User;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private List<User> getListOfUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Prod1", "Shirt", "EACH"));
        users.add(new User("Prod4", "Shoe", "EACH"));
        return users;



    }
}
