/*
Intent: Define an interface for creating an object, but let subclasses decide which class to instantiate.
It's a "factory of factories".

Example Use Case: Consider a scenario where you're developing a framework for a game.
In this game, you have different characters like warriors, mages, and archers. 
Each character has its own unique abilities and attributes. 
You want to create a character creation system where the specific type of character 
(warrior, mage, or archer) is decided by the user. 
*/


/*
Explanation:

We have an interface Character which defines the methods attack() and defend() that every character must implement.
We have concrete classes Warrior, Mage, and Archer which implement the Character interface.
We have a CharacterFactory interface with a method createCharacter() which returns a Character.
We have concrete factories WarriorFactory, MageFactory, and ArcherFactory which implement the CharacterFactory
interface and return the respective type of character.
In the Game class:

We create instances of each concrete factory (WarriorFactory, MageFactory, ArcherFactory).
We use these factories to create instances of different types of characters without specifying their concrete classes directly.
The factory method createCharacter() decides which concrete class to instantiate.
This way, the client code is decoupled from the concrete classes of characters. Depending on the factory used, different types 
of characters can be created without changing the client code.
 */


package CreationalPattern.Factory;

public class Game {
    public static void main(String[] args) {
        // Create a Warrior
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        warrior.attack();
        warrior.defend();

        // Create a Mage
        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter();
        mage.attack();
        mage.defend();

        // Create an Archer
        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter();
        archer.attack();
        archer.defend();
    }
}

