package laba1.builder;

public class JapaneseHouseBuilder extends HouseBuilder {
    public void buildWalls() {
        house.setWalls(House.Walls.PAPERWALLS);
    }

    public void buildDoors() {
        house.setDoors(House.Doors.BIRCHDOOR);
    }

    public void buildWindows() {
        house.setWindows(House.Windows.SQUARE);
    }
}
