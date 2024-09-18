package pack;

public class Book {

    private final String title; //uma constante
    private BookStatus status;

    public Book(String title) {
        this.title = title;
        this.status = BookStatus.AVAILABLE;
    }


    public String getTitle() {
        return title;
    }


    public BookStatus getStatus() {
        return status;
    }


    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Título: " + title + " - Status: " + status;
    }



}
