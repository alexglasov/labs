package laba1.builder;

public class House {
    private Walls walls;
    private Doors doors;
    private Windows windows;

    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "a house with " + getWalls().getName() + ", " + getDoors().getName() + ", and " + getWindows().getName();
    }

    public Walls getWalls() {
        return walls;
    }

    public Doors getDoors() {
        return doors;
    }

    public Windows getWindows() {
        return windows;
    }

    public enum Walls {
        BRICKSWALLS("brick walls"),
        WOODWALLS("wood walls"),
        PAPERWALLS("paper walls");

        Walls(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private final String name;
    }

    public enum Doors {
        OAKDOOR("oak door"),
        BIRCHDOOR("birch door"),
        SPRUCEDOOR("spruce door");

        Doors(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private final String name;
    }

    public enum Windows {
        ROUND("round windows"),
        SQUARE("square windows"),
        TRIANGLE("triangle windows");

        Windows(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private final String name;
    }
}
