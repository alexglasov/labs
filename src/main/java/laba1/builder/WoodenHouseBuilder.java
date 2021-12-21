package laba1.builder;

public class WoodenHouseBuilder extends HouseBuilder {
    public void buildWalls() {
        house.setWalls(House.Walls.WOODWALLS);
    }

    public void buildDoors() {
        house.setDoors(House.Doors.SPRUCEDOOR);
    }

    public void buildWindows() {
        house.setWindows(House.Windows.ROUND);
    }
}
