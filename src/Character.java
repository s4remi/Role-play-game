import java.util.ArrayList;

public class Character {
    private ArrayList<HandGear> handGears;
    private ArrayList<FootGear> footGears;
    private ArrayList<HeadGear> headGears;
    String characterName;
    private int initialAttackCapabilities;
    private int initialDefenseCapabilities;
    private int totalAttack;
    private int totalDefence;
    private final int NUM = 2;

    public Character(String characterName, int initialAttackCapabilities, int initialDefenseCapabilities) {
        this.characterName = characterName;
        this.initialAttackCapabilities = initialAttackCapabilities;
        this.initialDefenseCapabilities = initialDefenseCapabilities;
        handGears = new ArrayList<>();
        footGears = new ArrayList<>();
        headGears = new ArrayList<>();
    }

    public void pickupGear(Gear other) {
        if (other instanceof HeadGear) {
            if (!headGears.isEmpty()) {
                headGears.get(0).combine(other);
            } else {
                headGears.add((HeadGear) other);
            }
        } else if (other instanceof HandGear) {
            if (handGears.size() == NUM) {
                if (handGears.get(0).getAttackCapability() > handGears.get(1).getAttackCapability()) {
                    Gear newGear = handGears.get(0).combine(other);
                    handGears.set(0, (HandGear) newGear);
                } else if (handGears.get(0).getAttackCapability() == handGears.get(1).getAttackCapability()) {
                    if (handGears.get(0).getDefenseCapability() >= handGears.get(1).getDefenseCapability()) {
                        Gear newGear = handGears.get(0).combine(other);
                        handGears.set(0, (HandGear) newGear);
                    } else {
                        Gear newGear = handGears.get(1).combine(other);
                        handGears.set(1, (HandGear) newGear);
                    }
                } else if (handGears.get(0).getDefenseCapability() < handGears.get(1).getDefenseCapability()) {
                    Gear newGear = handGears.get(1).combine(other);
                    handGears.set(1, (HandGear) newGear);
                }
            } else {
                handGears.add((HandGear) other);
            }
        } else if (other instanceof FootGear) {
            if (footGears.size() == NUM) {
                if (footGears.get(0).getAttackCapability() > footGears.get(1).getAttackCapability()) {
                    Gear newGear = footGears.get(0).combine(other);
                    footGears.set(0, (FootGear) newGear);
                } else if (footGears.get(0).getAttackCapability() == footGears.get(1).getAttackCapability()) {
                    if (footGears.get(0).getDefenseCapability() >= footGears.get(1).getDefenseCapability()) {
                        Gear newGear = footGears.get(0).combine(other);
                        footGears.set(0, (FootGear) newGear);
                    } else {
                        Gear newGear = footGears.get(1).combine(other);
                        footGears.set(1, (FootGear) newGear);
                    }
                } else if (footGears.get(0).getDefenseCapability() < footGears.get(1).getDefenseCapability()) {
                    Gear newGear = footGears.get(1).combine(other);
                    footGears.set(1, (FootGear) newGear);
                }
            } else {
                footGears.add((FootGear) other);
            }
//                }else{
//                    Gear newGear= footGears.get(1).combine(other);
//                    footGears.set(1,(FootGear) newGear);
//                }
//            }else{
//                footGears.add((FootGear)other);
//            }
        }
    }

    public ArrayList<Integer> totalPower() {
        totalDefence = headGears.get(0).getDefenseCapability();
        totalAttack = 0;
        for (int i = 0; i < 2; i++) {
            totalDefence += handGears.get(i).getDefenseCapability();
            totalAttack += handGears.get(i).getAttackCapability();
            totalDefence += footGears.get(i).getDefenseCapability();
            totalAttack += footGears.get(i).getAttackCapability();
        }
        ArrayList<Integer> newTotal = new ArrayList<>();
        newTotal.add(totalDefence);
        newTotal.add(totalAttack);
        return newTotal;
    }

    public void print() {

        System.out.println(" character name is: "+characterName+ " head gear:\n");
        for (HeadGear hg : headGears) {
            System.out.println("name is" + hg.getAdjective() + " " + hg.getName() + "\n" +
                    "the defence is: " + hg.getDefenseCapability());
        }
        System.out.println("\nthe Hand GEAR :");
        for (HandGear hg : handGears) {
            System.out.println("name is" + hg.getAdjective() + " " + hg.getName() + "\n" +
                    "the defence is: " + hg.getDefenseCapability() + " the attack is:"
                    + hg.getAttackCapability());
        }
        System.out.println("\nthe Foot GEAR :");
        for (FootGear hg : footGears) {
            System.out.println("name is" + hg.getAdjective() + " " + hg.getName() + "\n" +
                    "the defence is: " + hg.getDefenseCapability() + " the attack is:"
                    + hg.getAttackCapability());
        }

    }
}
