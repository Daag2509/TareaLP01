package com.example.usermanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager implements CRUDOperations<User> {
    private Map<Integer, User> userDatabase = new HashMap<>();

    @Override
    public void create(User user) {
        userDatabase.put(user.getId(), user);
        System.out.println("User created: " + user);
    }

    @Override
    public User read(int id) {
        return userDatabase.get(id);
    }

    @Override
    public void update(User user) {
        if (userDatabase.containsKey(user.getId())) {
            userDatabase.put(user.getId(), user);
            System.out.println("User updated: " + user);
        } else {
            System.out.println("User not found!");
        }
    }

    @Override
    public void delete(int id) {
        if (userDatabase.remove(id) != null) {
            System.out.println("User deleted with ID: " + id);
        } else {
            System.out.println("User not found!");
        }
    }

    // Nueva función para listar todos los usuarios
    public List<User> listAll() {
        return new ArrayList<>(userDatabase.values()); // Convertir la colección de valores a un ArrayList
    }
}