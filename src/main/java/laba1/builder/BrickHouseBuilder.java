package laba1.builder;

public class BrickHouseBuilder extends HouseBuilder {
    public void buildWalls() {
        house.setWalls(House.Walls.BRICKSWALLS);
    }

    public void buildDoors() {
        house.setDoors(House.Doors.OAKDOOR);
    }

    public void buildWindows() {
        house.setWindows(House.Windows.SQUARE);
    }
}
