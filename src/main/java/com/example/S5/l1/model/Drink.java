package com.example.S5.l1.model;

public class Drink {
    private String name;
    private double volume;
    private int calories;
    private double price;

    // costruttore, getter e setter


    public Drink(String name, double volume, int calories, double price) {
        this.name = name;
        this.volume = volume;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
