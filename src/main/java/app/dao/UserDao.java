package app.dao;

import app.model.User;
import java.util.List;

public interface UserDao {
        void create(User user);

        User read(int id);

        void update(User user);

        void delete(User user);

        List<User> getUserList();
}
