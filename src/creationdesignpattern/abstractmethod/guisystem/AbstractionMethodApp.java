package creationdesignpattern.abstractmethod.guisystem;

public class AbstractionMethodApp {
    private Button button;
    private CheckBox checkBox;

    public AbstractionMethodApp(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void render() {
        button.render();
        button.onClick();
        checkBox.render();
        checkBox.onSelect();
    }

    public static void run() {
        System.out.println("===== Abstract Method =====\n");

        GUIFactory factory = new MacFactory();
        AbstractionMethodApp macApp = new AbstractionMethodApp(factory);
        macApp.render();

    }

}
