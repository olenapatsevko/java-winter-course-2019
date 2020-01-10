package tasktwo.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookShelfTest {

    private BookShelf bookShelf = new BookShelf(15) {{
        addBookToBookShelf(new Book("a", "b", "c", 2022, 22, 12.2));
    }};


    @Test
    public void generateBooks() {

        assertEquals(16, bookShelf.getBooks().length);
    }

    @Test
    public void getBooks() {
        assertEquals(16, bookShelf.getBooks().length);
    }


    @Test
    public void booksPublishingYear() {

        assertEquals(1, bookShelf.booksPublishingYear(2022).length);
    }

    @Test
    public void booksAuthor() {

        assertEquals(1, bookShelf.booksAuthor("b").length);
    }

}