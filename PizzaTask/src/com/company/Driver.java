package com.company;

public class Driver {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Here is " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("Here is " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("pepperoni");
        System.out.println("Here is " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("clam");
        System.out.println("Here is " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
