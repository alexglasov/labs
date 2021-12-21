package laba1.factory;

public abstract class AbstractDialog implements Dialog {
    @Override
    public void render() {
        Button b = getButton();

        System.out.println("+-----------------+");
        b.render();
        System.out.println("+-----------------+");
    }

    abstract Button getButton();
}
