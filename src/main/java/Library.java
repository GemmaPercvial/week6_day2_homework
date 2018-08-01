import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }



    public int countBooks() {
        int capacity = this.books.size();
        return capacity;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

//    public boolean isLibraryFull() {
//        int total = 0
//        for (int i = 0; i < countBooks(); i++) {
//            total += countBooks(i);
//        }
//        if total <= capacity;
//        return false;
//        else return true;
//    }
}