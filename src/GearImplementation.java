public abstract class GearImplementation implements Gear {
    private int defenseCapabilities;
    private int attackCapabilities;
    private String adjectiveName;
    private String name;
    private TypeId typeId;

    GearImplementation(String adjectiveName,String name, int defenseCapabilities, int attackCapabilities,TypeId typeId){
        this.attackCapabilities=attackCapabilities;
        this.defenseCapabilities=defenseCapabilities;
        this.adjectiveName=adjectiveName;
        this.name=name;
        this.typeId=typeId;
    }
    GearImplementation(String adjectiveName,String name, int defenseCapabilities,TypeId typeId){
        this.defenseCapabilities=defenseCapabilities;
        this.adjectiveName=adjectiveName;
        this.name=name;
        this.typeId=typeId;
    }
    @Override
    public int getDefenseCapability(){
        return defenseCapabilities;
    }
    @Override
    public int getAttackCapability(){
        return attackCapabilities;
    }
    @Override
    public String  getAdjective(){
        return  adjectiveName;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public TypeId getTypeId(){
        return typeId;
    }

    public int setAttackCapability(int AttackCapability){
        this.attackCapabilities=attackCapabilities;
        return attackCapabilities;
    }
    public int setDefenceCapability(int defenseCapabilities){
        this.defenseCapabilities=defenseCapabilities;
        return defenseCapabilities;
    }

    @Override
    public abstract Gear combine(Gear other);

//    {
//        if(this.typeId==other.getTypeId()){
//            this.adjectiveName= this.adjectiveName +other.getAdjective();
//            this.name=other.getName();
//            this.attackCapabilities +=other.getAttackCapability();
//            this.defenseCapabilities +=other.getDefenseCapability();
//        }else{
//            throw new IllegalArgumentException(" they are not the gears");
//        }
//    }
}
