package Factory_Pattern;

public class Client {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new NYPizzaShop();
        Pizza pizza = pizzaShop.orderPizza("New York Style Pizza");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
