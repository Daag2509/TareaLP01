package com.example.usermanagement;

public interface CRUDOperations<T> {
    void create(T item);
    T read(int id);
    void update(T item);
    void delete(int id);
}