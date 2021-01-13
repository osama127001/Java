package com.contour.repositorytask.DAL.Interfaces;

import com.contour.repositorytask.DAL.Exceptions.NullFieldException;

public interface IRepository<T> {
    public abstract T retrieve(String value) throws NullFieldException;
}
