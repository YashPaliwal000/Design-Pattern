package CreationalPattern.Prototype;

/*
Intent: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

Example Use Case: Consider a scenario where you have an existing object prototype and you want to create a new object that is 
identical to the existing one.
*/

// Prototype interface
interface Prototype {
    Prototype clone();
    void display();
}

// Concrete prototype
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}


public class PrototypePattern {
    public static void main(String[] args) {
        // Create prototype
        Prototype prototype = new ConcretePrototype("Prototype");

        // Clone prototype
        Prototype clone = prototype.clone();

        // Display prototype and clone
        prototype.display();
        clone.display();
    }
}

