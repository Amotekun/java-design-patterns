package creationdesignpattern.abstractfactory.guisystem;

public class AbstractFactoryApp {
    private Button button;
    private CheckBox checkBox;

    public AbstractFactoryApp(GUIFactory guiFactory) {
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
        AbstractFactoryApp macApp = new AbstractFactoryApp(factory);
        macApp.render();

    }

}
