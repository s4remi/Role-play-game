public interface Gear {
    int getDefenseCapability();
    int getAttackCapability();
    String getAdjective();
    String getName();
    Gear combine(Gear other);
    TypeId getTypeId();
    //String fullName= ali.getAdjective() + ali.getName();
    //
    // (headGear 1)happy hat
    //(head gear 2)sad helmet
    //-----------------
    //happy sad helmet

}
