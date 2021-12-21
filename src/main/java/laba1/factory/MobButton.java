package laba1.factory;

public class MobButton implements Button {
    @Override
    public void onClick() {
        System.out.println("0 - o");
    }

    @Override
    public void render() {
        System.out.println("{Button}");
    }
}
