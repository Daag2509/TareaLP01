package com.example.usermanagement;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Crear usuarios
        User user1 = new User(1, "Maria");
        User user2 = new User(2, "Luis");

        userManager.create(user1);
        userManager.create(user2);

        // Leer usuario
        System.out.println("Leyendo Usuario con ID 1: " + userManager.read(1));

        // Actualizar usuario
        user1.setName("Maria Perez");
        userManager.update(user1);

        // Leer actualizado
        System.out.println("Leyendo Usuario actualizado con ID 1: " + userManager.read(1));

        // Eliminar usuario
        userManager.delete(2);

        // Intentar leer eliminado
        System.out.println("Lectura de usuario eliminado con ID 2: " + userManager.read(2));

        // Intentar eliminar no existente
        userManager.delete(3); // No existe.

        // Listar todos los usuarios
        System.out.println("Lista de todos los usuarios:");
        List<User> allUsers = userManager.listAll();
        for (User user : allUsers) {
            System.out.println(user);
        }
    }
}