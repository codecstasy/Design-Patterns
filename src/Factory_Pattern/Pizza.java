package Factory_Pattern;

public interface Pizza {
    public void prepare();
    public void bake();
    public void cut();
    public void box();
}

class NeapolitanPizza implements Pizza {
    String pizzaType = "Neapolitan Pizza";
    public void prepare() {
        System.out.println("Neapolitan Pizza Prepared!");
    }
    public void bake() {
        System.out.println("Neapolitan Pizza Baked!");
    }
    public void cut() {
        System.out.println("Neapolitan Pizza Cut!");
    }
    public void box() {
        System.out.println("Neapolitan Pizza Boxed!");
    }
}

class NewYorkStylePizza implements Pizza {
    public void prepare() {
        System.out.println("New York Pizza Prepared!");
    }
    public void bake() {
        System.out.println("New York Pizza Baked!");
    }
    public void cut() {
        System.out.println("New York Pizza Cut!");
    }
    public void box() {
        System.out.println("New York Pizza Boxed!");
    }
}

class ChicagoDeepDishPizza implements Pizza {
    public void prepare() {
        System.out.println("Chicago Pizza Prepared!");
    }
    public void bake() {
        System.out.println("Chicago Pizza Baked!");
    }
    public void cut() {
        System.out.println("Chicago Pizza Cut!");
    }
    public void box() {
        System.out.println("Chicago Pizza Boxed!");
    }
}
