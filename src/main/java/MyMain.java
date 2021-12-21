import laba1.builder.BrickHouseBuilder;
import laba1.builder.House;
import laba1.builder.HouseBuildingDirector;

public class MyMain {
    public static void main(String[] args) {
        HouseBuildingDirector houseBuildingDirector = new HouseBuildingDirector();
        houseBuildingDirector.setHouseBuilder(new BrickHouseBuilder());
        houseBuildingDirector.buildHouse();
        House house = houseBuildingDirector.getHouse();
        System.out.println(house);
    }
}
