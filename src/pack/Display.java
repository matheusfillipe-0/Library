package pack;
public class Display {
    public static void main(String[] args){

        Library library = new Library();

        Book book1 = new Book("Velozes e Furiosos");
        Book book2 = new Book("Star Wars");
        Book book3 = new Book("Até o Ultimo Homem");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\nLivros na biblioteca:");
        library.displayBooks();
        System.out.println("\n");
        library.rentBook(book1);

        library.rentBook(book2);

        System.out.println("\nLivros na biblioteca:");
        library.displayBooks();

        System.out.println("\n");

        library.rentBook(book1);
    }
}