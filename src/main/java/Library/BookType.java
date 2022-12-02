package Library;

import java.time.LocalDateTime;

public interface BookType {
    abstract String Title();
    abstract String Author();
    abstract LocalDateTime checkOutDate();
    abstract boolean checkedOut();
}
