package CreationalPattern.Factory;

// Concrete factory for creating Archers
class ArcherFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Archer();
    }
}

