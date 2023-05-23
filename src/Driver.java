import java.util.ArrayList;

public class Driver {
    private Character ali;
    private Character shiva;
    private ArrayList<Gear> gearList;
    private boolean takeTurn=false;

    public Driver(Character ali, Character shiva, ArrayList<Gear> gearList ){
        this.ali=ali;
        this.shiva=shiva;
        this.gearList=gearList;
    }
    public void play() {
        int index = 0;
        while (index < 10) {
            if (takeTurn == false) {
                ali.pickupGear(gearList.get(index));
                ali.print();
                takeTurn = true;
            } else {
                shiva.pickupGear(gearList.get(index));
                shiva.print();
                takeTurn = false;
            }
            index++;
        }


    }
    //Player 1 :has 8 attack points and 6 defense strength.
    //Player 2 :has 4 attack points and 7 defense strength.
    //he battle ends with Player 1 having -2 units of damage and Player 2 having 1 unit of damage.
    //player 1 [attack num2 - defence num1] units of damage
    //Player 2 having 1 unit of damage.
    public String findWinner(Character ali, Character shiva){
        int damageValueAli;
        int damageValueShiva;
        damageValueAli=shiva.totalPower().get(1)-ali.totalPower().get(0);
        damageValueShiva=ali.totalPower().get(1)-shiva.totalPower().get(0);
        if(damageValueAli<damageValueShiva){
            return "ali Character wins";
        }else if(damageValueAli == damageValueShiva){
            return "the game is tie";
        }else{
            return " shiva Character wins";
        }
    }



}
