package laba1.builder;

public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void createNewHouse() {
        house = new House();
    }

    public abstract void buildWalls();
    public abstract void buildDoors();
    public abstract void buildWindows();
}
