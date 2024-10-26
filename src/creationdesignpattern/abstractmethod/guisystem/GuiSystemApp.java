package creationdesignpattern.abstractmethod.guisystem;

public class GuiSystemApp {
    private Button button;
    private CheckBox checkBox;

    public GuiSystemApp(GUIFactory guiFactory) {
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
        GuiSystemApp macApp = new GuiSystemApp(factory);
        macApp.render();

    }

}
