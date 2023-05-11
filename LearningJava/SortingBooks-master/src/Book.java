import java.util.*;


public class Book implements Comparable<Book>{
    private String name;
    private int page;
    private String author;
    private int publish;
    public Book(String name,int page,String author,int publish){
        this.name= name;
        this.page= page;
        this.author= author;
        this.publish= publish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublish() {
        return publish;
    }

    public void setPublish(int publish) {
        this.publish = publish;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
