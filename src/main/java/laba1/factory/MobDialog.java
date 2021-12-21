package laba1.factory;

public class MobDialog extends AbstractDialog {
    public Button getButton() {
        return new MobButton();
    }
}
