package CreationalPattern.Factory;

// Concrete class for Warrior

class Warrior implements Character {
    public void attack() {
        System.out.println("Warrior attacks with a sword");
    }

    public void defend() {
        System.out.println("Warrior defends with a shield");
    }
}