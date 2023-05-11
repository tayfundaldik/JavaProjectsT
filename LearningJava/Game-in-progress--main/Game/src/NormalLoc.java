public abstract class NormalLoc{

    private boolean ok;
    public boolean onLocation(boolean oque){
        if (oque) {
            this.ok = true;
        }
        return this.ok;
    }
}
