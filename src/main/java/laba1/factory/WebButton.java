package laba1.factory;

public class WebButton implements Button {
    @Override
    public void onClick() {
        System.out.println("o _ O");
    }

    @Override
    public void render() {
        System.out.println("<button>AAAAAA</button>");
    }
}
