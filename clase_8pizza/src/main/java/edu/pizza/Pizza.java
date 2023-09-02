package edu.pizza;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Topping> toppings = new ArrayList<>();

    public Pizza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calcularPrecioToppings() {
        double precioToppings = 0.0;
        for (Topping topping : toppings) {
            precioToppings += topping.getPrecio();
        }
        return precioToppings;
    }

    public double getPrice() {
        return precio;
    }

    public void prepare() {
        // Lógica para preparar la pizza
        System.out.println("Preparando la pizza " + nombre);
    }
}
