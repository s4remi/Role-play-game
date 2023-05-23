public class FootGear extends GearImplementation {
    public FootGear(String adjectiveName, String name, int defenseCapabilities, int attackCapabilities) {
        super(adjectiveName, name, defenseCapabilities, attackCapabilities, TypeId.FOOTGEAR);
    }

    @Override
    public Gear combine(Gear other) {
        Gear gear;
        if (other instanceof FootGear) {
            int newAttack = getAttackCapability();
            int newDefence = getDefenseCapability();
            newAttack += other.getAttackCapability();
            newDefence += other.getDefenseCapability();
            String newAdjective = getAdjective();
            String newName = other.getName();
            newAdjective += " " + other.getAdjective();
            gear= new FootGear(newAdjective,newName,newDefence,newAttack);
        }else{
            throw new IllegalArgumentException("they are not the same gears");
        }
        return gear;
    }

}
