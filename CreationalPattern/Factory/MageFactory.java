package CreationalPattern.Factory;

// Concrete factory for creating Mages
class MageFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Mage();
    }
}
