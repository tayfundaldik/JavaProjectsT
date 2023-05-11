import java.util.ArrayList;
import java.util.*;

public class counter implements Runnable{

    List<Integer>even = new ArrayList<Integer>();
    List<Integer>odd = new ArrayList<Integer>();




    @Override
    public void run() {
        List<Integer> threads = new ArrayList<Integer>();
        for (int i = 1; i <= 10000; i++) {
            threads.add(i);
        }
    List<Integer> part1 =threads.subList(0,2500);
    List<Integer> part2 =threads.subList(2500,5000);
    List<Integer> part3 = threads.subList(5000,7500);
    List<Integer> part4 = threads.subList(7500,10000);
        for (int j = 0; j < threads.size(); j++) {
            if ( threads.get(j) % 2 == 0) {
                this.even.add(j);
            }else{
                this.odd.add(j);
            }
        }
        System.out.println("Even Numbers Counted : "+getEven().size());
    }

    public List<Integer> getEven() {
        return even;
    }

    public void setEven(List<Integer> even) {
        this.even = even;
    }

    public List<Integer> getOdd() {
        return odd;
    }

    public void setOdd(List<Integer> odd) {
        this.odd = odd;
    }
}
