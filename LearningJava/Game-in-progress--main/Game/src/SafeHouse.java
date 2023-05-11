public class SafeHouse extends NormalLoc {
    public boolean ok = false;
    Player p1;


    public SafeHouse(boolean ok) {
        this.ok = ok;
    }

    public boolean onLocation(boolean oque){
        if (oque == true) {
            this.ok =true;
        }
        return this.ok;
    }
    public void healing(){

        if (p1.getID() == 1) {
            p1.setHealth(21);
        } else if (p1.getID() == 2) {
            p1.setHealth(18);
        } else if (p1.getID()==3) {
            p1.setHealth(24);
        }
    }
}
