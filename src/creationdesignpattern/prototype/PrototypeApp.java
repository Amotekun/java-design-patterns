package creationdesignpattern.prototype;

import creationdesignpattern.prototype.shape_cloning.Shape;
import creationdesignpattern.prototype.shape_cloning.ShapeCache;
import creationdesignpattern.prototype.employee_system.Employee;
import creationdesignpattern.prototype.game_character.GameCharacter;

public class PrototypeApp {
    public static void run() {

        System.out.println("===== Shape Clone Prototype pattern =====");

        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");

        System.out.println("Shape: " + clonedShape1.getType());
        System.out.println("Shape: " + clonedShape2.getType());
        System.out.println("Shape: " + clonedShape3.getType());

        System.out.println("===== Employee Clone Prototype pattern =====");

        Employee originalEmployee = new Employee("John Doe", "IT", 5000);

        Employee clonedEmployee1 = (Employee) originalEmployee.clone();
        Employee clonedEmployee2 = (Employee) originalEmployee.clone();

        System.out.println(clonedEmployee1);
        System.out.println(clonedEmployee2);

        System.out.println("===== Game Character Prototype pattern =====");

        GameCharacter originalGameCharacter = new GameCharacter("Granular", "Arcade", 100, 80, 90);

        GameCharacter clonedGameCharacter1 = (GameCharacter) originalGameCharacter.clone();
        GameCharacter clonedGameCharacter2 = (GameCharacter) originalGameCharacter.clone();

        System.out.println(clonedGameCharacter1);
        System.out.println(clonedGameCharacter2);
    }

}
