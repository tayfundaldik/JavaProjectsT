import java.util.Scanner;

public abstract class BattleLoc extends Obstacle {

    private Obstacle o;
    private boolean ok;
    Player pa;
    Zombie xx, xxx, xxxx;
    Vampire vv;
    Forest iq;
    Cave ga;
    Bear bb;
    River cc;
    game_over dc;

    Game a;

    public BattleLoc(int o_ID, int DAMAGE, int HP, int GOLD, Zombie ZOMBIE, Vampire VAMPIRE, Bear BEAR, Obstacle o) {
        super(o_ID, DAMAGE, HP, GOLD, ZOMBIE, VAMPIRE, BEAR);
        this.o = o;
    }

    public boolean onLocation(boolean oque) {
        if (oque) {
            this.ok = true;
        }
        return this.ok;
    }

    ;

    public Obstacle getO() {
        return o;
    }

    public void setO(Obstacle o) {
        this.o = o;
    }

    public void combat(int id) {
        if (id == 1) {
                Scanner sc =new Scanner(System.in);
                System.out.println("You saw a Zombie.Do you want to attack?('y' or 'n') ");
                for (int i = 0; i < 999; i++) {
                String jj = sc.nextLine();
                if (jj == "y") {
                xx.setMonsterHp(xx.getMonsterHp() - pa.getDamage());
                pa.setHealth(pa.getHealth() - xx.getMonsterDmg());
                System.out.println("Your HP :"+pa.getHealth()+"\n"+"Zombie's HP: "+xx.getMonsterHp());
                Scanner inp = new Scanner(System.in);
                System.out.println("Do you want to attack again? ('y' or 'n')");
                    if (jj == "n") {
                        System.out.println("Okay...");
                        a.Location1(3);
                        break;
                    }
                if (xx.getMonsterHp() == 0) {
                    System.out.println("You've beaten the Zombie");
                    pa.setGold(pa.getGold()+xx.getMonsterGold());
                    System.out.println("!!!!!You gained"+xx.getMonsterGold()+"Gold!!!!!");
                    pa.setFood(true);
                    ga.setFood(false);
                    a.Location1(3);
                    break;
                } else if (pa.getHealth() == 0) {
                    System.out.println("You are dead. Game Over.");
                    System.out.println(dc.gameover());
                    break;
                }
                    }
                else {
                    a.Location1(3);
                    break;
                }

                }

            }
        else if (id == 2) {
            Scanner sc =new Scanner(System.in);
            System.out.println("You saw a Vampire.Do you want to attack?('y' or 'n') ");
            for (int i = 0; i < 999; i++) {
                String jj = sc.nextLine();
                if (jj == "y") {
                    vv.setMonsterHp(vv.getMonsterHp() - pa.getDamage());
                    pa.setHealth(pa.getHealth() - vv.getMonsterDmg());
                    System.out.println("Your HP :"+pa.getHealth()+"\n"+"Vampire's HP: "+vv.getMonsterHp());
                    Scanner inp = new Scanner(System.in);
                    System.out.println("Do you want to attack again? ('y' or 'n')");
                    if (jj == "n") {
                        System.out.println("Okay then...");
                        a.Location1(3);
                        break;
                    }
                    if (vv.getMonsterHp() == 0) {
                        System.out.println("You've beaten the Vampire");
                        pa.setGold(pa.getGold()+vv.getMonsterGold());
                        System.out.println("!!!!!You gained"+vv.getMonsterGold()+"Gold!!!!!");
                        pa.setFirewood(true);
                        iq.setFirewood(false);
                        a.Location1(3);
                        break;
                    } else if (pa.getHealth() == 0) {
                        System.out.println("You are dead. Game Over.");
                        System.out.println(dc.gameover());
                        break;
                    }
                }
                else {
                    a.Location1(3);
                    break;
                }

            }

        }else if (id == 3) {
            Scanner sc =new Scanner(System.in);
            System.out.println("You saw a Bear.Do you want to attack?('y' or 'n') ");
            for (int i = 0; i < 999; i++) {
                String jj = sc.nextLine();
                if (jj == "y") {
                    bb.setMonsterHp(bb.getMonsterHp() - pa.getDamage());
                    pa.setHealth(pa.getHealth() - bb.getMonsterDmg());
                    System.out.println("Your HP :"+pa.getHealth()+"\n"+"Bear's HP: "+bb.getMonsterHp());
                    Scanner inp = new Scanner(System.in);
                    System.out.println("Do you want to attack again? ('y' or 'n')");
                    if (jj == "n") {
                        System.out.println("Okay...");
                        a.Location1(3);
                        break;
                    }
                    if (bb.getMonsterHp() == 0) {
                        System.out.println("You've beaten the Bear");
                        pa.setGold(pa.getGold()+bb.getMonsterGold());
                        System.out.println("!!!!!You gained"+bb.getMonsterGold()+"Gold!!!!!");
                        pa.setWater(true);
                        cc.setWater(false);
                        a.Location1(3);
                        System.out.println("\n" +
                                " __      __                          __       __  __            __ \n" +
                                "|  \\    /  \\                        |  \\  _  |  \\|  \\          |  \\\n" +
                                " \\$$\\  /  $$______   __    __       | $$ / \\ | $$ \\$$ _______  | $$\n" +
                                "  \\$$\\/  $$/      \\ |  \\  |  \\      | $$/  $\\| $$|  \\|       \\ | $$\n" +
                                "   \\$$  $$|  $$$$$$\\| $$  | $$      | $$  $$$\\ $$| $$| $$$$$$$\\| $$\n" +
                                "    \\$$$$ | $$  | $$| $$  | $$      | $$ $$\\$$\\$$| $$| $$  | $$ \\$$\n" +
                                "    | $$  | $$__/ $$| $$__/ $$      | $$$$  \\$$$$| $$| $$  | $$ __ \n" +
                                "    | $$   \\$$    $$ \\$$    $$      | $$$    \\$$$| $$| $$  | $$|  \\\n" +
                                "     \\$$    \\$$$$$$   \\$$$$$$        \\$$      \\$$ \\$$ \\$$   \\$$ \\$$\n" +
                                "                                                                   \n" +
                                "                                                                   \n" +
                                "                                                                   \n");
                        break;
                    } else if (pa.getHealth() == 0) {
                        System.out.println("You are dead. Game Over.");
                        System.out.println(dc.gameover());
                        break;
                    }
                }
                else {
                    a.Location1(3);
                    break;
                }

            }

        }


        }
            }

