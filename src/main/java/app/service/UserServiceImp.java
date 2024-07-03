package app.service;

import app.dao.UserDAO;
import app.dao.UserDAOImp;
import app.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImp implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;


    }

    @Transactional
    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Transactional
    @Override
    public User read(Long id) {
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

    @Transactional
    @Override
    public List<User> getUserList() {
        return userDAO.getUserList();
    }
}
