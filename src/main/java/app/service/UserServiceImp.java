package app.service;

import app.dao.UserDao;
import app.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImp implements UserService{

    private final UserDao userDAO;

    @Autowired
    public UserServiceImp(UserDao userDAO) {
        this.userDAO = userDAO;


    }

    @Transactional
    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Override
    public User read(int id) {
        return userDAO.read(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public List<User> getUserList() {
        return userDAO.getUserList();
    }
}
