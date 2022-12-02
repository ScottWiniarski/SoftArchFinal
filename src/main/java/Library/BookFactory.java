package Library;

import java.time.LocalDateTime;

public class BookFactory {

    public static Book getBook(String title, String author, LocalDateTime printDate, boolean checkedOut, String bookType){
        return switch(bookType){
            case "Fiction" -> new Fiction(title, author, printDate, checkedOut);
            case "Non-Fiction" -> new NonFiction(title, author, printDate, checkedOut);
            default -> null;
        };
    }
}
