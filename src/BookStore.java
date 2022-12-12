import java.util.Arrays;
import java.util.Random;

public class BookStore {
    private static int LASTED_ID;
    private int id;
    private String name;
    private Book[] books;
    private int size;

    public BookStore(String name, int size) {
        this.id = LASTED_ID++;
        this.name = Book.isValid(name) ? name : "Untitled";
        this.size = size;
        books = new Book[size];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book[] getAllBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        int randomID = new Random().nextInt(size - 1);
        for (int i = 0; i < books.length; i++) {
            if(books[randomID] == null) books[randomID] = book;
        }
        return false;
    }

    public boolean sellBook(int id) {
        for (int i = 0; i < books.length; i++) {
            if (books[id] != null) {
                books[id] = null;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookStore{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", books=").append(Arrays.toString(books));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
