package com.contour.repositorytask.DAL.Repositories;

import com.contour.repositorytask.DAL.Interfaces.IRepository;

import java.util.Collection;
import java.util.HashMap;

public abstract class Repository<T> implements IRepository<T> {

    private int repoId;
    private HashMap<Integer, T> repo = new HashMap<Integer, T>();

    public Repository() {
        this.repoId = 0;
    }

    // Retrieve
    public Collection<T> retrieve() {
        return repo.values();
    }

    public T retrieve(int id) {
        return repo.getOrDefault(id, null);
    }

    // Delete
    public void delete() {
        repo.clear();
    }
    public void delete(int id) {
        repo.remove(id);
    }

    // Update
    public void update(int id, T obj) {
        repo.replace(id, obj);
    }

    // Create
    public void create(T obj) {
        this.repoId++;
        this.repo.put(this.repoId, obj);
    }

}
