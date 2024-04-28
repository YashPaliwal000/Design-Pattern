package CreationalPattern.Factory;

// Concrete class for Archer
class Archer implements Character {
    public void attack() {
        System.out.println("Archer attacks with a bow and arrow");
    }

    public void defend() {
        System.out.println("Archer defends by dodging");
    }
}
