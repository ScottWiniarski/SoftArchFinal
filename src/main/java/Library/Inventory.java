package Library;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Book> theInventory = new ArrayList<>();

    public Inventory(){
        LocalDateTime checkoutDate = LocalDateTime.parse("12/10/2019");
        theInventory.add(BookFactory.getBook("My Struggles", "Scott", checkoutDate,false,"NonFicion"));
    }
}
