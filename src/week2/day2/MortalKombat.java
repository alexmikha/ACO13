package week2.day2;

/**
 * Created by mykhailov on 29.05.2016.
 */
public class MortalKombat {
    public static void main(String[] args) {
        Fighter f1 = new LukKang("Luck", 20);
        Fighter f2 = new Subzero("Sub", 15);


        Arena arena = new Arena(f1, f2);
        arena.startFight();
    }
}
