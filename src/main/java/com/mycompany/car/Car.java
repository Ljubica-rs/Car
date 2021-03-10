
package com.mycompany.car;

public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    
    public Car() {
    }
    public Car(int buildYear){
        this.buildYear = buildYear;
    }
    public Car(String brand, String model, String color, int buildYear){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
}
    
    public int getBuildYear (){
        return this.buildYear;
    }
    
    public void printAttributes(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Boja: " + this.color);
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
    }
    
    
}
