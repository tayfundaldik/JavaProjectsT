public class Individual extends Account{


    @Override
    public int compareTo(Account o) {
        return 0;
    }

    @Override
    public void InsurancePolicy(int x){
        if (x == 1) {
            System.out.println("");
        }
    }
}
