package by.tms.project.Data;

public interface Bookshelf {

    default void init() {
        add(new BookImpl("Jules Verne", "Journey to the center of the earth", 9.5));
        add(new BookImpl("Daniel Defoe","Robinson Crusoe" , 8.9));
    }

    Bookshelf getInstance();

    <E extends Book> boolean add(E book);

    Book findByTitle(String title);
}
