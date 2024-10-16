package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Андрей", "Иванов", (byte) 45);
        userService.saveUser("Иван", "Петров", (byte) 25);
        userService.saveUser("Сергей", "Федоров", (byte) 37);
        userService.saveUser("Ольга", "Пушкина", (byte) 31);
        List<User> allUsers = userService.getAllUsers();
        allUsers.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
