package laba2.adapter;

import common.Service;

public class AdapterService extends RoundStick implements Service {
    public void exec() {
        RoundHole hole = new RoundHole(5);
        RoundStick roundStick = new RoundStick(5);

        System.out.println(hole.fits(roundStick));

        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        System.out.println(hole.fits(smallSquareStickAdapter));
        System.out.println(hole.fits(largeSquareStickAdapter));
    }
}
