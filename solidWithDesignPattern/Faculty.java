public class Faculty implements Borrower{
    private String name;
    private String id;

    public Faculty(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getBorrowerName() {
        return name + " (Faculty)";
    }

    @Override
    public String getBorrowerId() {
        return id;
    }
}
