package by.markov.classes.simpleclasses.books;

import by.markov.classes.service.simpleclasses.books.BookService;

public class Main {
    public static void main(String[] args) {
        PublishingHouse houseEksmo = new PublishingHouse("Eksmo", "Moskow");
        PublishingHouse houseAst = new PublishingHouse("AST", "Moskow");
        PublishingHouse houseAversev = new PublishingHouse("Aversev", "Minsk");
        PublishingHouse houseUnipress = new PublishingHouse("Unipress", "Minsk");
        PublishingHouse housePiter = new PublishingHouse("Piter", "Saint-Petersburg");
        PublishingHouse houseMif = new PublishingHouse("Mif", "Moskow");

        Book book1 = new Book("Metro 2033", "Glukhovsky", houseEksmo, 2006, 544, 930, "Solid");
        Book book2 = new Book("Metro 2034", "Glukhovsky", houseAst, 2019, 384, 1150, "Solid");
        Book book3 = new Book("Metro 2035", "Glukhovsky", houseAst, 2019, 384, 1290, "Solid");
        Book book4 = new Book("Mumu", "Turgenev", houseAversev, 2020, 112, 230, "Soft");
        Book book5 = new Book("Anna Karenina", "Tolstoy", houseEksmo, 2021, 800, 340, "Solid");
        Book book6 = new Book("Voyna i mir", "Tolstoy", housePiter, 2020, 1408, 620, "Solid");
        Book book7 = new Book("Igrok", "Dostoevsky", houseMif, 2014, 416, 450, "Solid");
        Book book8 = new Book("Mertvye dushi", "Gogol", houseMif, 2021, 416, 630, "Solid");
        Book book9 = new Book("Master i Margarita", "Bulgakov", houseUnipress, 2020, 480, 610, "Solid");
        Book book10 = new Book("Idiot", "Dostoevsky", houseMif, 2012, 640, 580, "Solid");

        Book[] books = new Book[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        BookService service = new BookService();
        service.getMenu(books);
    }
}
