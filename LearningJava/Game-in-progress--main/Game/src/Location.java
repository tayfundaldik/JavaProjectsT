public abstract class Location extends Player {
    private String nameu;
    private Player player;
    Cave caaa;
    SafeHouse xx;

    public Location(String nameu,String player_class, int ID, int damage, int health, int gold,boolean water,boolean food, boolean firewood, String weaponName, String armorName, int weaponDamage, int armorDefence) {
        super(player_class,ID,damage,health,gold,water,food,firewood,weaponName ,armorName,weaponDamage,armorDefence);
        this.nameu = nameu;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public abstract void Location1(int a);

    public abstract boolean onLocation();
}
