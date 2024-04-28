package CreationalPattern.AbstractFactory;

/*
Intent: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

Example Use Case: Consider a scenario where you're developing a GUI library. You want to create GUI components like buttons, 
menus, and windows that should be consistent across the application. However, different operating systems (Windows, macOS, Linux) 
have different implementations for these components. You want to provide a way to create these components without specifying their 
concrete classes.
 */

 
// Abstract product A (Button)
interface Button {
    void render();
}

// Concrete product A1 (WindowsButton)
class WindowsButton implements Button {
    public void render() {
        System.out.println("Render a button in Windows style");
    }
}

// Concrete product A2 (MacOSButton)
class MacOSButton implements Button {
    public void render() {
        System.out.println("Render a button in MacOS style");
    }
}

// Abstract product B (Checkbox)
interface Checkbox {
    void render();
}

// Concrete product B1 (WindowsCheckbox)
class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render a checkbox in Windows style");
    }
}

// Concrete product B2 (MacOSCheckbox)
class MacOSCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render a checkbox in MacOS style");
    }
}

// Abstract factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete factory 1 (WindowsFactory)
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Concrete factory 2 (MacOSFactory)
class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}


public class AbstractFactory {
    private GUIFactory factory;

    public AbstractFactory(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Create a Windows application
        AbstractFactory windowsApp = new AbstractFactory(new WindowsFactory());
        windowsApp.createUI();

        // Create a MacOS application
        AbstractFactory macOsApp = new AbstractFactory(new MacOSFactory());
        macOsApp.createUI();
    }
}