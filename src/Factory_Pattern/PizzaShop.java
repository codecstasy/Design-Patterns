package Factory_Pattern;

public abstract class PizzaShop {
    public abstract Pizza orderPizza(String type);
}

class NYPizzaShop extends PizzaShop {
    public Pizza orderPizza(String type) {
        if(type.equals("New York Style Pizza"))
            return new NewYorkStylePizza();
        else if(type.equals("Neapolitan Pizza"))
            return new NeapolitanPizza();
        else
            return null;
    }
}

class ChicagoPizzaShop extends PizzaShop {
    public Pizza orderPizza(String type) {
        if(type.equals("Chicago Style Pizza"))
            return new ChicagoDeepDishPizza();
        if(type.equals("Neapolitan Pizza"))
            return new NeapolitanPizza();
        else
            return null;
    }
}
