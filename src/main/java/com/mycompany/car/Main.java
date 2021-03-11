
package com.mycompany.car;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car();
        audi.printAttributes();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "black";
//        audi.buildYear = 2005;
        audi.printAttributes();
//        System.out.println("Brand: " + audi.brand);
//        System.out.println("Model: " + audi.model);
//        System.out.println("Boja: " + audi.color);
//        System.out.println("Godina proizvodnje: " + audi.getBuildYear());
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "X5";
        bmw.color = "white";
//        bmw.buildYear = 2010;
        bmw.printAttributes();
//        System.out.println("Brand: " + bmw.brand);
//        System.out.println("Model: " + bmw.model);
        
        Car fiat = new Car(2010);
        System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
        
        Car lada = new Car("Lada", "Niva", "red", 2000, 0, 50, 10);
        lada.printAttributes();
//        System.out.println("Brand: " + lada.brand);
//        System.out.println("Model: " + lada.model);
//        System.out.println("Boja: " + lada.color);
//        System.out.println("Godina proizvodnje: " + lada.getBuildYear());
         lada.travel(300);
         lada.printAttributes();
         lada.travel(200);
         lada.printAttributes();
         lada.travel(100);
         lada.printAttributes();
    }
    
}
