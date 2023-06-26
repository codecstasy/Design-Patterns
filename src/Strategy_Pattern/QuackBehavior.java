package Strategy_Pattern;

public interface QuackBehavior {
    public void quack();
}

class LoudQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Louuuudddd Quack!!!");
    }
}

class SoftQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Softttt Quack!!!");
    }
}

class NoQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Sorry I cannot Quack!!!");
    }
}
