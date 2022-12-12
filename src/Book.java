public class Book {
    int id;
    private static int LASTED_ID;
    private final String name;
    private final String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = isValid(name) ? name : "Untitled";
        this.author = isValid(author) ? author : "Untitled";
        this.price = price;
        this.id = LASTED_ID++;
    }

    public static boolean isValid(String str) {
        return str != null && !str.isBlank();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return id == book.id;
    }

}
