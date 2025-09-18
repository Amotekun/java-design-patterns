package creationdesignpattern.abstractfactory.guisystem;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button");
    }

    @Override
    public void onClick() {
        System.out.println("Mac Button clicked");
    }

}
