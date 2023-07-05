package com.bankexercise.solerabankexercise;

import com.bankexercise.solerabankexercise.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private  static List<User> users = new ArrayList<>();
    private static int usersCount = 0;

    static {
        users.add( new User("Emmanuel","ortega","emmatega@yahoo.com", (++usersCount),
                "bootca2"));
        users.add(new User("Dojo", "kata","kata@solera.com", (++usersCount),
                "100000.49f"));
        users.add(new User("George","cartel","kartel@live.com", (++usersCount),
                "123888.89f"));
        users.add(new User("Kojo","Buju","buju@hotmail.com", (++usersCount),"180888.99f"));
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId()==id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId()==id;
        users.removeIf(predicate);
    }

    // public User findOne(int id){}
}
