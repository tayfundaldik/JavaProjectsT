import java.util.Scanner;

public class ToolStore extends NormalLoc {
    private int pistolID = 25;
    private int swordID = 35;
    private int rifleID = 45;
    private int lightID = 15;
    private int mediumID =25;
    private int heavyID=40;
    Player p1;
    Game aaaaaa;

    public ToolStore(int pistolID, int swordID, int rifleID, int lightID, int mediumID, int heavyID, int weapon, int armor, boolean ok) {
        this.pistolID = pistolID;
        this.swordID = swordID;
        this.rifleID = rifleID;
        this.lightID = lightID;
        this.mediumID = mediumID;
        this.heavyID = heavyID;

        this.ok = ok;
    }

    public int getPistolID() {
        return pistolID;
    }

    public void setPistolID(int pistolID) {
        this.pistolID = pistolID;
    }

    public int getSwordID() {
        return swordID;
    }

    public void setSwordID(int swordID) {
        this.swordID = swordID;
    }

    public int getRifleID() {
        return rifleID;
    }

    public void setRifleID(int rifleID) {
        this.rifleID = rifleID;
    }

    public int getLightID() {
        return lightID;
    }

    public void setLightID(int lightID) {
        this.lightID = lightID;
    }

    public int getMediumID() {
        return mediumID;
    }

    public void setMediumID(int mediumID) {
        this.mediumID = mediumID;
    }

    public int getHeavyID() {
        return heavyID;
    }

    public void setHeavyID(int heavyID) {
        this.heavyID = heavyID;
    }


    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    private boolean ok;
    public boolean onLocation(boolean oque) {
        if (oque) {
            this.ok = true;
        }
        return this.ok;
    }

    public void menu(){
        System.out.println("!!!!!Welcome to the DOOMSTORE!!!!!");
        Scanner inp = new Scanner(System.in);
        System.out.println("What do you want to buy?(type 'A' for armor,'W' for weapon)");
        String a=inp.nextLine();
        if (a=="W") {
            System.out.println("Which weapon do you want to buy?('1' for pistol,'2' for sword,'3' for rifle)");
            int weaponID=inp.nextInt();
            if (weaponID == 1) {
                System.out.println("You have chosen the Mysterious Pistol. It cost :" + pistolID + "gold.");
                p1.setGold(p1.getGold() - pistolID);
            } else if (weaponID == 2) {
                System.out.println("You have chosen the Eternal Sword. It cost :" + swordID + "gold.");
                p1.setGold(p1.getGold() - swordID);
            } else if (weaponID == 3) {
                System.out.println("You have chosen the BOOM RIFLE. It cost :" + rifleID + "gold.");
                p1.setGold(p1.getGold() - rifleID);
            }
            else {
                System.out.println("You typed wrong.Have a good day!!!");
                aaaaaa.Location1(3);
            }
        }else if(a == "A"){
            System.out.println("Which armor do you want to buy?('1' for light armor,'2' for medium armor,'3' for heavy armor)");
            int armorID = inp.nextInt();
            if (armorID == 1) {
                System.out.println("You have chosen the Light Armor. It cost :" + lightID + "gold.");
                p1.setGold(p1.getGold() - lightID);
            } else if (armorID == 2) {
                System.out.println("You have chosen the Medium Armor. It cost :" + mediumID + "gold.");
                p1.setGold(p1.getGold() - mediumID);
            } else if (armorID == 3) {
                System.out.println("You have chosen the Heavy Armor. It cost :" + heavyID + "gold.");
                p1.setGold(p1.getGold() - heavyID);
            }
            else {
                System.out.println("You typed wrong.Have a good day!!!");
                aaaaaa.Location1(3);
            }
        } else{
            System.out.println("You typed wrong.Have a good day!!!");
            aaaaaa.Location1(3);

        }

    }


}
