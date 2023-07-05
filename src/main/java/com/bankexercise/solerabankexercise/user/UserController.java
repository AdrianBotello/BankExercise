package com.bankexercise.solerabankexercise.user;


import com.bankexercise.solerabankexercise.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// This is a prototype class, The class UserResource has the static list of user which is usable.
@RestController
public class UserController {

    @GetMapping(path = "/all-users")
    public ArrayList<User> users(){
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("Emmanuel","ortega","emmatega@yahoo.com",848475,
                "9578888.19f");
        User user2= new User("Dojo", "kata","kata@solera.com",10045,
                "100000.49f");
        User user3 = new User("George","cartel","kartel@live.com", 844455,
                "123888.89f");
        User user4 = new User("Kojo","Buju","buju@hotmail.com", 89332,"180888.99f");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return  users;

    }

}
