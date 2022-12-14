package by.tms.project.Data;

import java.util.ArrayList;

public class BookshelfImpl extends ArrayList<Book> implements Bookshelf {
    private static Bookshelf INSTANCE;


    public Bookshelf getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BookshelfImpl();
            INSTANCE.init();
        }
        return INSTANCE;
    }


    public Book findByTitle(String title) {
        return this.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .findFirst()
                .orElse(null);
    }
}
