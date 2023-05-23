public class HeadGear extends GearImplementation {
    // String adjectiveName,String name, int defenseCapabilities, int attackCapabilities

    public HeadGear(String adjectiveName,String name, int defenseCapabilities){
        super(adjectiveName,name,defenseCapabilities,TypeId.HEADGEAR);
    }


    @Override
    public Gear combine(Gear other) {
        Gear gear;
        if (other instanceof HeadGear) {
            int newDefence = getDefenseCapability();
            newDefence += other.getDefenseCapability();
            String newAdjective = getAdjective();
            String newName = other.getName();
            newAdjective += " " + other.getAdjective();
            gear= new HeadGear(newAdjective,newName,newDefence);
        }else{
            throw new IllegalArgumentException("they are not the same gears");
        }
        return gear;
    }

}
