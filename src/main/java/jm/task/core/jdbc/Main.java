package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService USER = new UserServiceImpl();

    public static void main(String[] args) {
        USER.createUsersTable();

        USER.saveUser("Name1", "LastName1", (byte) 20);
        USER.saveUser("Name2", "LastName2", (byte) 25);
        USER.saveUser("Name3", "LastName3", (byte) 31);
        USER.saveUser("Name4", "LastName4", (byte) 38);

        USER.removeUserById(1);
        USER.getAllUsers();
        USER.cleanUsersTable();
        USER.dropUsersTable();

    }
}
