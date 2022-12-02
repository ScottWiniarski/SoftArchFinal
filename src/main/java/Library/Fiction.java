package Library;

import java.time.LocalDateTime;

public class Fiction extends Book{

    public Fiction(String title, String author, LocalDateTime checkOutDate, boolean checkedOut){
        super(title, author, checkOutDate, checkedOut);
    }

    @Override
    public double getFee() {
        return 0;
    }
}
