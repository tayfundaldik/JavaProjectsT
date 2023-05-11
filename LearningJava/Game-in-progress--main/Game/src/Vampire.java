public class Vampire {
    private int monsterID = 2;
    private int monsterDmg = 4;
    private int monsterHp = 14;
    private int monsterGold =7;

    public Vampire(int monsterID, int monsterDmg, int monsterHp, int monsterGold) {
        this.monsterID = monsterID;
        this.monsterDmg = monsterDmg;
        this.monsterHp = monsterHp;
        this.monsterGold = monsterGold;
    }

    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public int getMonsterDmg() {
        return monsterDmg;
    }

    public void setMonsterDmg(int monsterDmg) {
        this.monsterDmg = monsterDmg;
    }

    public int getMonsterHp() {
        return monsterHp;
    }

    public void setMonsterHp(int monsterHp) {
        this.monsterHp = monsterHp;
    }

    public int getMonsterGold() {
        return monsterGold;
    }

    public void setMonsterGold(int monsterGold) {
        this.monsterGold = monsterGold;
    }
}
