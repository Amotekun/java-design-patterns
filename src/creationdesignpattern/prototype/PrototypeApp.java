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

        Employee clonedEmployee1 = originalEmployee.clone();
        Employee clonedEmployee2 = originalEmployee.clone();

        System.out.println("Original: " + originalEmployee);
        System.out.println("Clone 1: " + clonedEmployee1);
        System.out.println("Clone 2: " + clonedEmployee2);
        System.out.println("Are clones equal? " + clonedEmployee1.equals(clonedEmployee2));
        System.out.println("Are they the same object? " + (clonedEmployee1 == clonedEmployee2));

        System.out.println("===== Game Character Prototype pattern =====");

        GameCharacter originalGameCharacter = new GameCharacter("Granular", "Arcade", 100, 80, 90);

        GameCharacter clonedGameCharacter1 = originalGameCharacter.clone();
        GameCharacter clonedGameCharacter2 = originalGameCharacter.clone();

        System.out.println("Original: " + originalGameCharacter);
        System.out.println("Clone 1: " + clonedGameCharacter1);
        System.out.println("Clone 2: " + clonedGameCharacter2);
        System.out.println("Are clones equal? " + clonedGameCharacter1.equals(clonedGameCharacter2));
        System.out.println("Are they the same object? " + (clonedGameCharacter1 == clonedGameCharacter2));
    }

}
