import java.util.Random;

public class River extends BattleLoc {
    private Bear b1;
    private Bear b2;
    private Bear b3;
    private boolean water = true;
    private int bnum;
    Random rand =new Random();
    BattleLoc b;

    public River(int o_ID, int DAMAGE, int HP, int GOLD, Zombie ZOMBIE, Vampire VAMPIRE, Bear BEAR, Obstacle o, Bear b1, Bear b2, Bear b3, boolean water) {
        super(o_ID, DAMAGE, HP, GOLD, ZOMBIE, VAMPIRE, BEAR, o);
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.water = water;
    }

    public Bear getB1() {
        return b1;
    }

    public void setB1(Bear b1) {
        this.b1 = b1;
    }

    public Bear getB2() {
        return b2;
    }

    public void setB2(Bear b2) {
        this.b2 = b2;
    }

    public Bear getB3() {
        return b3;
    }

    public void setB3(Bear b3) {
        this.b3 = b3;
    }

    public boolean  getWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void riverCombat(){
        bnum=rand.nextInt(3-1+1)+1;
        for (int i = 1; i <=bnum ; i++) {
            b.combat(obstacleNumber(3));
        }
    }
}
