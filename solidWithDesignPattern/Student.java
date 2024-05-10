public class Student implements Borrower{
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getBorrowerName() {
        return name + " (Student)";
    }

    public String getBorrowerId() {
        return id;
    }
}
