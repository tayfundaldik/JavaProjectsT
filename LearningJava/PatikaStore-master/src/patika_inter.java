import java.util.Scanner;
import java.util.TreeSet;

public class patika_inter {

    public int process;
    private String patika;
    private TreeSet<Store> items = new TreeSet<>();
    public static patika_inter xst= null;

    private patika_inter(String patika) {
        this.patika = patika;
    }
    public static patika_inter mall(String patika) {
        if (xst == null) {
            xst = new patika_inter(patika);
            return xst;
        }
        return xst;
    }
    public void options(){
        System.out.println("#################################################################");
        System.out.println("|Patika Store|");
        System.out.println("#################################################################");
        System.out.println("Select an option please.");
        System.out.println(" 1 - Notebook List");
        System.out.println(" 2 - Mobile Phone List");
        System.out.println(" 3 - Brand Name List");
        System.out.println(" 5 - Add New Notebook Model");
        System.out.println(" 6 - Add New Mobile Phone");
        System.out.println(" 0 - Exit");
        System.out.println("#################################################################");
    }
    public void play(){
        Scanner sc = new Scanner(System.in);
        xst.options();
        System.out.println("Which operation do you want?");
        while (true){
            process = sc.nextInt();
            if (process == 0) {
                sc.close();
                break;
            }
            switch (process){
                case 1:
                    xst.notebookS();
                    System.out.println("Back to the menu (8)");
                    break;
                case 2:
                    xst.mobilephoneS();
                    System.out.println("Back to the menu (8)");
                    break;
                case 3:
                    xst.brandS();
                    System.out.println("Back to the menu (8)");
                    break;

                case 5:
                    xst.addNote();
                    System.out.println("Back to the menu (8)");
                    break;
                case 6:
                    xst.addMobile();
                    System.out.println("Back to the menu (8)");
                    break;
                case 8:
                    xst.options();
                    break;
                default:
                    System.out.println("!!!!!Wrong typing!!!!!");
            }
        }
    }
            public void addNote(){
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter Notebook model name.");
                    String nin=input.nextLine();
                    System.out.println("Please enter Notebook price.");
                    double nip = input.nextDouble();
                    System.out.println("Please enter Notebook Brand.");
                    String nib = input.nextLine();
                    System.out.println("Please Enter Notebook Storage Capacity.");
                    int nis = input.nextInt();
                    System.out.println("Please enter Notebook Screen Size.");
                    double nisc= input.nextDouble();
                    System.out.println("Please enter Notebook RAM Capacity.");
                    int ram = input.nextInt();
                    input.close();
                    Store itemsadd = new Notebook(nin,nip,nib,nis,nisc,ram);
                    this.items.add(itemsadd);
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("You have an error.");
                    System.out.println(e.getMessage());
                }
            }
            public void addMobile() {
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter Mobile Phone model name.");
                    String nin = input.nextLine();
                    System.out.println("Please enter Mobile Phone price.");
                    double nip = input.nextDouble();
                    System.out.println("Please enter Mobile Phone Brand.");
                    String nib = input.nextLine();
                    System.out.println("Please Enter Mobile Phone Storage Capacity.");
                    int nis = input.nextInt();
                    System.out.println("Please enter Mobile Phone Screen Size.");
                    double nisc = input.nextDouble();
                    System.out.println("Please enter Mobile Phone Camera Megapixel.");
                    int nique = input.nextInt();
                    System.out.println("Please enter Mobile Phone Battery Capacity.");
                    double niba = input.nextDouble();
                    System.out.println("Please enter Mobile Phone RAM Capacity.");
                    int ram = input.nextInt();
                    System.out.println("Please enter Mobile Phone Color.");
                    String nic = input.nextLine();
                    input.close();
                    Store itemsAdd = new MobilePhones(nin,nip,nib,nis,nisc,nique,niba,ram,nic);
                    this.items.add(itemsAdd);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("You have an error.");
                    System.out.println(e.getMessage());
                }
            }
            public void notebookS(){
                System.out.println(
                        " ------------------------------------------------------------------------------ ");
                System.out.println(
                        "| ID | Product Model | Price | Brand | Storage Capacity | screen Size | RAM |");
                System.out.println(
                        " ------------------------------------------------------------------------------ ");
                for (Store p : items) {
                    if (p instanceof Notebook)
                        System.out.println(p.toString());
                }
            }
            public void mobilephoneS() {
                System.out.println(
                        " ------------------------------------------------------------------------------------------------------ ");
                System.out.println(
                        "| product Id | product Name | price | brand | storage size | screen Size | battery Power | ram | color |");
                System.out.println(
                        " ------------------------------------------------------------------------------------------------------ ");
                for (Store p : items) {
                    if (p instanceof MobilePhones)
                        System.out.println(p.toString());
                }
            }
            public void brandS(){
                for (Sorting a : Store.brandname){
                    System.out.println("\t\t-" + a);
                }

    }
    public void addNote(String nin,double nip, String nib ,int nis,double nisc,int ram){
        Store itemsadd = new Notebook(nin,nip,nib,nis,nisc,ram);
        this.items.add(itemsadd);
            }
            public void addMobile(String nin,double nip,String nib,int nis,double nisc,int nique,double niba, int ram,String nic){
                Store itemsAdd = new MobilePhones(nin,nip,nib,nis,nisc,nique,niba,ram,nic);
                this.items.add(itemsAdd);
            }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public String getPatika() {
        return patika;
    }

    public void setPatika(String patika) {
        this.patika = patika;
    }

    public TreeSet<Store> getItems() {
        return items;
    }

    public void setItems(TreeSet<Store> items) {
        this.items = items;
    }

    public static patika_inter getXst() {
        return xst;
    }

    public static void setXst(patika_inter xst) {
        patika_inter.xst = xst;
    }
}

