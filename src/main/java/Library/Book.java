package Library;

import java.time.LocalDateTime;

public abstract class Book {
    private String Title;
    private String Author;
    private LocalDateTime PrintDate;
    private boolean CheckedOut;

    public Book(String title, String author, LocalDateTime printDate, boolean checkedOut) {
        Title = title;
        Author = author;
        PrintDate = printDate;
        CheckedOut = checkedOut;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public LocalDateTime getPrintDate() {
        return PrintDate;
    }

    public void setPrintDate(LocalDateTime printDate) {
        this.PrintDate = printDate;
    }

    public boolean isCheckedOut() {
        return CheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.CheckedOut = checkedOut;
    }

    public abstract double getFee();
}
