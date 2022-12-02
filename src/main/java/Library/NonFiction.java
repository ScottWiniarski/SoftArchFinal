package Library;

import java.time.LocalDateTime;

public class NonFiction extends Book{

    public NonFiction(String title, String author, LocalDateTime printDate, boolean checkedOut) {
        super(title, author, printDate, checkedOut);
    }

    @Override
    public double getFee() {
        return 0;
    }
}
