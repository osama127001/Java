package com.contour.repositorytask.DAL.Interfaces;

public interface IRepository<T> {
    public abstract T find(String value);
}
