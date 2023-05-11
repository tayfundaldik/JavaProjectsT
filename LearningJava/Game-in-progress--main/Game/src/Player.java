public class Player extends Inventory{
    private String player_class;
    private int ID;
    private int damage;
    private int health;
    private int gold;
    game_over ax;


    public Player(String player_class, int ID, int damage, int health, int gold,boolean water,boolean food, boolean firewood, String weaponName, String armorName, int weaponDamage, int armorDefence){
        super(water,food,firewood,weaponName ,armorName,weaponDamage,armorDefence);
        this.player_class= player_class;
        this.ID =ID;
        this.damage= damage;
        this.health=health;
        this.gold=gold;


    }
    public void PlayerCharacterChoice(int ID1){
        if (ID1 == 1) {
            this.player_class="Samurai" ;
            this.damage = 5;
            this.health=21;
            this.gold= 15;
        } else if (ID1 == 2) {
            this.player_class="Archer";
            this.damage= 7;
            this.health= 18;
            this.gold= 5;
        } else if (ID1 == 3) {
            this.player_class= "Knight";
            this.damage=8;
            this.health=18;
            this.gold=5;
        }else {
            System.out.println("!!! Your Choice Not Found !!!");
            System.out.println(ax.gameover());
        }
    }

    public String getPlayer_class() {
        return player_class;
    }

    public void setPlayer_class(String player_class) {
        this.player_class = player_class;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }



}
