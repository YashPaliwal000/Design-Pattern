package CreationalPattern.Factory;

// Concrete class for Mage
class Mage implements Character {
    public void attack() {
        System.out.println("Mage attacks with a spell");
    }

    public void defend() {
        System.out.println("Mage defends with a magical barrier");
    }
}