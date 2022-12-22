package oop.lesson.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {

    private List<User> users = new ArrayList<>();

    public Personal addUser(User user) {
        users.add(user);
        return this;
    }

    public int size(){
        return users.size();
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index++ < users.size();
            }

            @Override
            public User next() {
                return users.get(index - 1);
            }
        };
    }


}
