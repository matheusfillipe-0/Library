package pack;
import java.util.ArrayList;


class Library {

    private ArrayList<Book> books;


    public Library() {
        books = new ArrayList<>();
    }



    public void addBook(Book book) {
        books.add(book);
        System.out.println("Livro '" +  book.getTitle() + "' foi adicionadoa lista de E-Books.");
    }



    public void rentBook(Book book) {
        if (book.getStatus() == BookStatus.AVAILABLE) {
            book.setStatus(BookStatus.LENT);
            System.out.println("Livro '" + book.getTitle() + "' foi alugado.");
        } else {
            System.out.println("Livro '" + book.getTitle() + "' não está disponível para ser alugado.");
        }
    }


    public void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

    }



}



