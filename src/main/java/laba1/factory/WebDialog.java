package laba1.factory;

public class WebDialog extends AbstractDialog {
    public Button getButton() {
        return new WebButton();
    }
}
