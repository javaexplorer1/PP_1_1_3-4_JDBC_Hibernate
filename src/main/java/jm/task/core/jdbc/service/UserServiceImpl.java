package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDaoJDBCImpl userDAOJDBCImpl = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDAOJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDAOJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDAOJDBCImpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDAOJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDAOJDBCImpl.getAllUsers();
    }


    public void cleanUsersTable() {
        userDAOJDBCImpl.cleanUsersTable();
    }
}
