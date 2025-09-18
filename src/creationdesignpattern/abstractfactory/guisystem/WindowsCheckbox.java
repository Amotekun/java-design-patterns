package creationdesignpattern.abstractfactory.guisystem;

public class WindowsCheckbox implements CheckBox {
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }

    public void onSelect() {
        System.out.println("Windows Checkbox selected");
    }
}
