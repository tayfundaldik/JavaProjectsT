import java.util.Random;

public class Forest extends BattleLoc{
    private Vampire v1;
    private Vampire v2;
    private Vampire v3;
    Obstacle o;
    BattleLoc b;
    private int count;
    Random rand =new Random();
    private boolean firewood = true;
    private int vnum;

    public Forest(int o_ID, int DAMAGE, int HP, int GOLD, Zombie ZOMBIE, Vampire VAMPIRE, Bear BEAR, Obstacle o, Vampire v1, Vampire v2, Vampire v3, int count, Random rand, boolean firewood) {
        super(o_ID, DAMAGE, HP, GOLD, ZOMBIE, VAMPIRE, BEAR, o);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.count = count;
        this.rand = rand;
        this.firewood = firewood;
    }

    public Vampire getV1() {
        return v1;
    }

    public void setV1(Vampire v1) {
        this.v1 = v1;
    }

    public Vampire getV2() {
        return v2;
    }

    public void setV2(Vampire v2) {
        this.v2 = v2;
    }

    public Vampire getV3() {
        return v3;
    }

    public void setV3(Vampire v3) {
        this.v3 = v3;
    }

    public boolean getFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public void forestCombat(){
        vnum=rand.nextInt(3-1+1)+1;
        for (int i = 1; i <=vnum ; i++) {
            b.combat(obstacleNumber(2));
        }
    }
}
