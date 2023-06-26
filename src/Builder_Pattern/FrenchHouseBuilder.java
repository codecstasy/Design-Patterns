package Builder_Pattern;

public class FrenchHouseBuilder implements Builder{
    public void buildWall() {
        System.out.println("Wall built!");
    }
    public void buildFloor() {
        System.out.println("Floor built");
    }
    public House getHouse() {
        return new FrenchStyleHouse();
    }
}
