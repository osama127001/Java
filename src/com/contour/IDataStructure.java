package com.contour;

public interface IDataStructure {
    public void insert(int data);
    public void delete(int index);
    public int search(int data);
    public int length();
    public void traverse();
}
