package javaoo.ootwo.inheritance;

import java.util.HashMap;

public class Car {
    private String model;
    private String brand;
    private String color;
    private int seats;

    public Car (String model, String brand, String color, int seats){
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.seats = seats;
    }

    public String carDetails(){
        return "Detalhes do carro: " +
                "\nModelo: " + model +
                "\nMarca: " + brand +
                "\nColor: " + color +
                "\nAssentos: " + seats;
    }
}