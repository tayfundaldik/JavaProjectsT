import java.util.Random;

public class Cave extends BattleLoc {
    private Zombie z1;
    private Zombie z2;
    private Zombie z3;
    private boolean food = true;
    Random rand = new Random();
    private int znum;
    BattleLoc rr;


    public Cave(int o_ID, int DAMAGE, int HP, int GOLD, Zombie ZOMBIE, Vampire VAMPIRE, Bear BEAR, Obstacle o, Zombie z1, Zombie z2, Zombie z3, boolean food) {
        super(o_ID, DAMAGE, HP, GOLD, ZOMBIE, VAMPIRE, BEAR, o);
        this.z1 = z1;
        this.z2 = z2;
        this.z3 = z3;
        this.food = food;
    }

    public Zombie getZ1() {
        return z1;
    }

    public void setZ1(Zombie z1) {
        this.z1 = z1;
    }

    public Zombie getZ2() {
        return z2;
    }

    public void setZ2(Zombie z2) {
        this.z2 = z2;
    }

    public Zombie getZ3() {
        return z3;
    }

    public void setZ3(Zombie z3) {
        this.z3 = z3;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }


    public  void caveCombat(){

        znum=rand.nextInt(3-1+1)+1;
        for (int i = 1; i <=znum ; i++) {
            rr.combat(obstacleNumber(1));
        }

    }

}
