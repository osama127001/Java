package com.contour.interfaces;

public abstract class Person implements IExercise, IWork {

    @Override
    public void walk() {}

    @Override
    public void run(){}

    @Override
    public abstract void code();

    @Override
    public void attendMeeting() {}
}
