package laba1.builder;

public class HouseBuildingDirector {
        private HouseBuilder houseBuilder;

        public void setHouseBuilder(HouseBuilder houseBuilder) {
            this.houseBuilder = houseBuilder;
        }

        public House getHouse() {
            return houseBuilder.getHouse();
        }

        public void buildHouse() {
            houseBuilder.createNewHouse();
            houseBuilder.buildWalls();
            houseBuilder.buildDoors();
            houseBuilder.buildWindows();
        }
}
