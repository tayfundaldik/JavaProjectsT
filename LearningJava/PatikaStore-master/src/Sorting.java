public class Sorting implements Comparable<Sorting>{
   private int id;
    private String name;

    public Sorting( String name) {

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Sorting o) {
        return this.name.compareTo(o.name);
    }
}
