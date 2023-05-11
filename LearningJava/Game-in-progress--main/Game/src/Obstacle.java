public class Obstacle {
    private int O_ID;
    private int DAMAGE;
    private int HP;
    private int GOLD;
    Zombie ZOMBIE ;
    Vampire VAMPIRE;
    Bear BEAR;

    public Obstacle(int o_ID, int DAMAGE, int HP, int GOLD, Zombie ZOMBIE, Vampire VAMPIRE, Bear BEAR) {
        this.O_ID = o_ID;
        this.DAMAGE = DAMAGE;
        this.HP = HP;
        this.GOLD = GOLD;
        this.ZOMBIE = ZOMBIE;
        this.VAMPIRE = VAMPIRE;
        this.BEAR = BEAR;
    }

    public int obstacleNumber(int O_ID) {
        if (O_ID == 1) {

            this.DAMAGE=ZOMBIE.getMonsterDmg();
            this.HP=ZOMBIE.getMonsterHp();
            this.GOLD=ZOMBIE.getMonsterGold();
        } else if (O_ID == 2) {
            this.DAMAGE=VAMPIRE.getMonsterDmg();
            this.HP=VAMPIRE.getMonsterHp();
            this.GOLD=VAMPIRE.getMonsterGold();

        } else if (O_ID == 3) {
            this.DAMAGE=BEAR.getMonsterDmg();
            this.HP=BEAR.getMonsterHp();
            this.GOLD=BEAR.getMonsterGold();

        }else {
            System.out.println("Wrong ID.");
        }
            return 1;

    }

    public int getO_ID() {
        return O_ID;
    }

    public void setO_ID(int o_ID) {
        O_ID = o_ID;
    }

    public int getDAMAGE() {
        return DAMAGE;
    }

    public void setDAMAGE(int DAMAGE) {
        this.DAMAGE = DAMAGE;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getGOLD() {
        return GOLD;
    }

    public void setGOLD(int GOLD) {
        this.GOLD = GOLD;
    }
}
