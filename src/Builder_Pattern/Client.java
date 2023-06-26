package Builder_Pattern;

public class Client {
    public static void main(String[] args) {
        Builder builder = new FrenchHouseBuilder();
        builder.buildFloor();
        builder.buildWall();

        House newHouse = builder.getHouse();
        newHouse.showHouse();
    }
}
