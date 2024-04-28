package CreationalPattern.Factory;;

class WarriorFactory implements CharacterFactory {
    public Character createCharacter() {
        return new Warrior();
    }
}
