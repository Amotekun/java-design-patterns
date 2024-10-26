package creationdesignpattern.abstractmethod.guisystem;

public class MacCheckbox implements CheckBox {
    public void render() {
        System.out.println("Rendering MacOS Checkbox");
    }

    public void onSelect() {
        System.out.println("MacOS Checkbox checked");
    }

}
