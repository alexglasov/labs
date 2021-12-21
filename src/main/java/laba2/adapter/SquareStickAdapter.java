package laba2.adapter;

class SquareStickAdapter extends RoundStick {
    private final SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        super((int) (stick.getWidth() * Math.sqrt(2) / 2));
        this.stick = stick;
    }

    public int getRadius() {
        return super.getRadius();
    }

    public int getWidth() {
        return stick.getWidth();
    }
}
