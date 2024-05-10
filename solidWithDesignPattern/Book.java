public class Book implements Resource{
    private String bookName;
    private String isbn;

    public Book(String bookName, String isbn) {
        this.bookName = bookName;
        this.isbn = isbn;
    }


    @Override
    public String getTitle() {
        return bookName + " (Book)";
    }

    @Override
    public String getResourceId() {
        return isbn;
    }
}
