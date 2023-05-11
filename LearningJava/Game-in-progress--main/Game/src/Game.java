import java.util.Scanner;

public class Game extends Location {
    private Player p1;
    private Location location;
    game_over cx;
    River riv;
    Cave cav;
    Forest fr;
    SafeHouse ii;
    ToolStore tt;
    NormalLoc nn;

    public Game(String nameu, String player_class, int ID, int damage, int health, int gold, boolean water, boolean food, boolean firewood, String weaponName, String armorName, int weaponDamage, int armorDefence) {
        super(nameu, player_class, ID, damage, health, gold, water, food, firewood, weaponName, armorName, weaponDamage, armorDefence);
    }

    @Override
    public void Location1(int a) {
        if (a == 1) {
            cav.onLocation(false);
            fr.onLocation(false);
            riv.onLocation(false);
            nn.onLocation(false);
            tt.onLocation(false);
            ii.onLocation(true);
            ii.healing();
        } else if (a == 2) {
            cav.onLocation(false);
            fr.onLocation(false);
            riv.onLocation(false);
            nn.onLocation(false);
            ii.onLocation(false);
            tt.onLocation(true);
            Scanner yt = new Scanner(System.in);
            System.out.println("Merchant Cresus: Do you want to buy somethin'?('y' o 'n')");
            String answ = yt.nextLine();
            if (answ == "y") {
                tt.menu();
            } else if (answ == "n") {
                System.out.println("Merchant Cresus: Have a great day.");
                cav.onLocation(false);
                fr.onLocation(false);
                riv.onLocation(false);
                nn.onLocation(true);
                ii.onLocation(false);
                tt.onLocation(false);
            } else {
                System.out.println("Wrong Typing.");
                cav.onLocation(false);
                fr.onLocation(false);
                riv.onLocation(false);
                nn.onLocation(true);
                ii.onLocation(false);
                tt.onLocation(false);
            }

        } else if (a == 3) {
            cav.onLocation(false);
            fr.onLocation(false);
            riv.onLocation(false);
            nn.onLocation(true);
            ii.onLocation(false);
            tt.onLocation(false);
        } else if (a == 4) {
            System.out.println("You entered the Paracave.");
            cav.onLocation(true);
            fr.onLocation(false);
            riv.onLocation(false);
            nn.onLocation(false);
            ii.onLocation(false);
            tt.onLocation(false);
            cav.caveCombat();

        } else if (a == 5) {
            System.out.println("You entered the Ivy Forest.");
            cav.onLocation(false);
            fr.onLocation(true);
            riv.onLocation(false);
            nn.onLocation(false);
            ii.onLocation(false);
            tt.onLocation(false);
            fr.forestCombat();
        } else if (a == 6) {
            System.out.println("You entered the Rein River.");
            cav.onLocation(false);
            fr.onLocation(false);
            riv.onLocation(true);
            nn.onLocation(false);
            ii.onLocation(false);
            tt.onLocation(false);
            riv.riverCombat();
        }


    }

    @Override
    public boolean onLocation() {
        return true;
    }

    public void start() {
        System.out.println("Welcome to the Game");
        Scanner aac = new Scanner(System.in);
        System.out.println("Which class do you want to play?\nSamurai:1,Archer:2,Knight:3");
        int tp = aac.nextInt();
        if (tp == 1) {
            System.out.println("You chose 'Samurai Path.'");
            p1.PlayerCharacterChoice(1);
        } else if (tp == 2) {
            System.out.println("You selected a 'Glorious Archer Way'.");
            p1.PlayerCharacterChoice(2);

        } else if (tp == 3) {
            System.out.println("You preferred 'Maker's Chosen Knight Story'");
            p1.PlayerCharacterChoice(3);
        } else {
            System.out.println("You typed wrong" + "\n" + cx.gameover());
            p1.PlayerCharacterChoice(4);
        }
        Location1(1);
        Scanner fff = new Scanner(System.in);
        System.out.println("You are at your home... \nYou wanna get outside? ('y' or 'n')");
        String zzz = fff.nextLine();
        if (zzz == "y") {
            Location1(3);
            Scanner xcx = new Scanner(System.in);
            System.out.println("You saw the DOOMSTORE.\nYou wanna enter? ('y' or 'n')");
            String xxxc = aac.nextLine();
            if (xxxc == "y") {
                Location1(2);
            } else if (xxxc == "n") {
                System.out.println("Okay then...\nYou are on the road again.");
                Location1(3);
                Scanner sc = new Scanner(System.in);
                System.out.println("You saw the Paracave...\nDo you wanna enter? ('y' or 'n')");
                String ans2 = sc.nextLine();
                if (ans2 == "y") {
                    Location1(4);
                    Scanner sca = new Scanner(System.in);
                    System.out.println("You hurt...\nYou wanna go to your home? ('y' or 'n')");
                    String bnb = sca.nextLine();
                    if (bnb == "y") {
                        Location1(1);
                        Scanner mmk = new Scanner(System.in);
                        System.out.println("You rested...\nYou wanna go outside?('y' or 'n')");
                        String x = mmk.nextLine();
                        if (x == "y") {
                            Location1(3);
                            Scanner r9 = new Scanner(System.in);
                            System.out.println("You saw the Ivy Forest...\nYou want to enter?");
                            String bm = r9.nextLine();
                            if (bm == "y") {
                                Location1(5);
                                Scanner yu = new Scanner(System.in);
                                System.out.println("You hurt...\nYou wanna go to your home? ('y' or 'n')");
                                String bn = sca.nextLine();
                                if (bn == "y") {
                                    Location1(1);
                                    Scanner mm = new Scanner(System.in);
                                    System.out.println("You rested...\nYou wanna go outside?('y' or 'n')");
                                    String rx = mm.nextLine();
                                    if (rx == "y") {
                                        Location1(3);
                                        Scanner viz = new Scanner(System.in);
                                        System.out.println("You saw the Rein River...\nDo you want to walk there?('y' or 'n')");
                                        String qe = viz.nextLine();
                                        if (qe == "y") {
                                            Location1(6);
                                        }
                                    }
                                }
                            }

                        }
                    } else {
                        System.out.println("Wrong typing.You didn't entered the DOOMSTORE.");
                        Location1(3);
                        System.out.println("Okay then...\nYou are on the road again.");
                        Location1(3);
                        Scanner ssc = new Scanner(System.in);
                        System.out.println("You saw the Paracave...\nDo you wanna enter? ('y' or 'n')");
                        String aans2 = ssc.nextLine();
                        if (aans2 == "y") {
                            Location1(4);
                            Scanner saaca = new Scanner(System.in);
                            System.out.println("You hurt...\nYou wanna go to your home? ('y' or 'n')");
                            String bsnb = saaca.nextLine();
                            if (bsnb == "y") {
                                Location1(1);
                                Scanner mmka = new Scanner(System.in);
                                System.out.println("You rested...\nYou wanna go outside?('y' or 'n')");
                                String xas = mmka.nextLine();
                                if (xas == "y") {
                                    Location1(3);
                                    Scanner r93 = new Scanner(System.in);
                                    System.out.println("You saw the Ivy Forest...\nYou want to enter?");
                                    String bm3 = r93.nextLine();
                                    if (bm3 == "y") {
                                        Location1(5);
                                        Scanner yure = new Scanner(System.in);
                                        System.out.println("You hurt...\nYou wanna go to your home? ('y' or 'n')");
                                        String bnr = yure.nextLine();
                                        if (bnr == "y") {
                                            Location1(1);
                                            Scanner qmm = new Scanner(System.in);
                                            System.out.println("You rested...\nYou wanna go outside?('y' or 'n')");
                                            String qrx = qmm.nextLine();
                                            if (qrx == "y") {
                                                Location1(3);
                                                Scanner viz = new Scanner(System.in);
                                                System.out.println("You saw the Rein River...\nDo you want to walk there?('y' or 'n')");
                                                String qe = viz.nextLine();
                                                if (qe == "y") {
                                                    Location1(6);
                                                }
                                            }
                                        }}}}}
                    }
                }
            }


        }
    }
}