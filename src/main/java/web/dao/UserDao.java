package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void addUser(User user);
    void updateUser(long id, User user);
    void deleteUser(long id);
}
