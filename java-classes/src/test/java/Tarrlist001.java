import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shenjie
 * @version 1.0
 */
public class Tarrlist001 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红",100);
        books[1] = new Book("金",90);
        books[2] = new Book("青",5);
        books[3] = new Book("java",300);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() - o2.getPrice() < 0){
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        System.out.println(Arrays.toString(books));
    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return (getName() + getPrice());
    }
}