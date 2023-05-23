import java.util.ArrayList;


import static org.junit.Assert.*;

public class DriverTest {

    private Character ali;
    private Character shiva;
    private ArrayList<Gear> testme= new ArrayList<>();
    private Driver driver;


    //String adjectiveName,String name, int defenseCapabilities


    public void setup(){
        Gear one = new HeadGear("funny" ,"head", 6);
        Gear two= new HeadGear("sad", "hat",2 );
        Gear three= new HandGear("brave","sword",22,60);
        Gear four= new HandGear("brave01","sword01",24,44);
        Gear five= new HandGear("brave02","sword02",33,55);
        Gear six= new HandGear("brave03","sword03",77,34);
        Gear seven= new FootGear("brave04","sword04",22,60);
        Gear eight= new FootGear("brave08","sword08",12,63);
        Gear nine= new FootGear("brave09","sword09",88,66);
        Gear ten= new FootGear("brave10","sword10",100,100);
        testme.add(one);
        testme.add(two);
        testme.add(three);
        testme.add(four);
        testme.add(five);
        testme.add(six);
        testme.add(seven);
        testme.add(eight);
        testme.add(nine);
        testme.add(ten);
        ali = new Character("ali",0,0);
        shiva = new Character("shiva",0,0);
        driver = new Driver(ali, shiva, testme );
    }

    @org.junit.Test
    public void play() {
        setup();
        driver.play();
    }

    @org.junit.Test
    public void findWinner() {
        setup();
        driver.play();

        System.out.println(driver.findWinner(ali, shiva));
    }

}
