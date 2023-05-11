import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<>();
        Book obj1 = new Book("Harry Potter",623,"J.K. Rowling",1997);
        Book obj2 = new Book("Percy Jackson",532,"Rick Riordan",2006);
        Book obj3 = new Book("Lord of the Rings",587,"J.R.R.Tolkien",1985);
        Book obj4 = new Book("Les Misérables",612,"Victor Hugo",1862);
        Book obj5 = new Book("Frankenstein",280,"Mary Shelley",1818);
        books.add(obj1);
        books.add(obj2);
        books.add(obj3);
        books.add(obj4);
        books.add(obj5);

        for (Book o:
             books) {
            System.out.println(o.getName());
        }
        System.out.println("############################\n############################");
        TreeSet<Book> booksnew = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPage()-o1.getPage();
            }
        });
        booksnew.addAll(books);
        for (Book o:booksnew
             ) {
            System.out.println(o.getName());
        }

        }

    }
