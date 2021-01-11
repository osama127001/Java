package com.contour.organization.DAL.Interfaces;

public interface IRepository<T> {
    public abstract T find(String value);
}
