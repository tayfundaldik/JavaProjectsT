import java.util.Comparator;
import java.util.TreeSet;

public class Store implements Comparator<Store> {

    public static TreeSet<Sorting> brandname = new TreeSet<>();
       static {

        brandname.add(new Sorting("Samsung"));
        brandname.add(new Sorting("Lenovo"));
        brandname.add(new Sorting("Apple"));
        brandname.add(new Sorting("Huawei"));
        brandname.add(new Sorting("Casper"));
        brandname.add(new Sorting("Asus"));
        brandname.add(new Sorting("HP"));
        brandname.add(new Sorting("Xiaomi"));
        brandname.add(new Sorting("Monster"));

       }
    @Override
    public int compare(Store o1, Store o2) {
        return 0;
    }


}
