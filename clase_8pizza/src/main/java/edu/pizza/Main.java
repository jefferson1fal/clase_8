package edu.pizza;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una pizza base
        Pizza pizza = new Pizza("Pizza base", 11.99);

        // Obtener el precio inicial de la pizza
        double precioInicial = pizza.getPrice();

        // Agregar los toppings a la pizza
        Topping salsaTomate = new Topping("Salsa de tomate", 2.0);
        Topping quesoMozzarella = new Topping("Queso mozzarella rallado", 3.0);
        Topping pepperoni = new Topping("Pepperoni", 4.0);
        Topping jamon = new Topping("Jamon", 4.0);
        Topping salchicha = new Topping("Salchicha italiana", 4.0);
        Topping chorizo = new Topping("Chorizo", 4.0);
        Topping tocino = new Topping("Tocino", 4.0);
        Topping carneMolida = new Topping("Carne molida de res o cerdo", 4.0);

        // Agregar los toppings a la pizza
        pizza.addTopping(salsaTomate);
        pizza.addTopping(quesoMozzarella);
        pizza.addTopping(pepperoni);
        pizza.addTopping(jamon);
        pizza.addTopping(salchicha);
        pizza.addTopping(chorizo);
        pizza.addTopping(tocino);
        pizza.addTopping(carneMolida);

        // Calcular el precio total de la pizza después de agregar los toppings
        double precioTotal = precioInicial + pizza.calcularPrecioToppings();

        // Calcular cuánto subió el valor de la pizza
        double aumentoDePrecio = precioTotal - precioInicial;

        // Mostrar los precios
        System.out.println("Precio de la pizza inicial: $" + precioInicial);
        System.out.println("Precio total de la pizza después de agregar los toppings: $" + precioTotal);
        System.out.println("Aumento de precio: $" + aumentoDePrecio);

        // Preparar la pizza
        pizza.prepare();
    }
}
