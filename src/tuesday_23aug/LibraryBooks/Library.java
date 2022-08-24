package tuesday_23aug.LibraryBooks;

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("JK rowling", "jkrowling@example.org", 'F');
        Book book1 = new Book("Harry Potter", author1, 99.99, 1);

        System.out.println(book1);
    }
}
