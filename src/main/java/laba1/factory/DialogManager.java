package laba1.factory;

public class DialogManager {
    private Dialog dialog;

    public void configure() {
        if (System.getProperty("os.name").equals("Android 145")) {
            dialog = new MobDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    public void render() {
        dialog.render();
    }
}
