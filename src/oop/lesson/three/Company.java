package oop.lesson.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;

    public Company(User user) {
        this.user = user;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> personal = deepTree(user);
            Iterator<User> userIterator = personal.iterator();
            @Override
            public boolean hasNext() {
                return userIterator.hasNext();
            }

            @Override
            public User next() {
                return userIterator.next();
            }
        };
    }

    private List<User> deepTree(User user){
        List<User> result = new ArrayList<>();
        result.add(user);
        if (user.getSubordinates().size() == 0){
            return result;
        }
        for (User item: user.getSubordinates()) {
            result.addAll(deepTree(item));
        }
        return result;
    }
}
