package laba1;

import laba1.builder.BrickHouseBuilder;
import laba1.builder.House;
import laba1.builder.HouseBuildingDirector;
import org.junit.Test;

import java.util.Objects;

public class BuilderTest {
    @Test
    public void test() {
        HouseBuildingDirector houseBuildingDirector = new HouseBuildingDirector();
        houseBuildingDirector.setHouseBuilder(new BrickHouseBuilder());
        houseBuildingDirector.buildHouse();
        House house = houseBuildingDirector.getHouse();

        Objects.requireNonNull(house);

        if (!house.toString().equals("a house with brick walls, oak door, and square windows")) {
            throw new RuntimeException("test failed!");
        }
    }
}
