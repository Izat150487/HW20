package com.company;

public class Car implements AutoCloseable{
    public void close() {
        System.err.println("Mashina jabylyp jatat!");
    }
    public void drive() {
        System.out.println("Mashina jurup jatat!");
    }
}
