package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Фунтик", "Поросенок", (byte) 10);
        userService.saveUser("Старец", "Старый", (byte) 100);
        userService.saveUser("Жизнь", "Сверхновая", (byte) 1);
        userService.saveUser("Хатабыч", "Старик", (byte) 127);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.close();
    }
}
