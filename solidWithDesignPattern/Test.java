public class Test {
    public static void main(String[] args) {

        //BORROWERS [Students, Faculty, etch.]
        Borrower student = new Student("Clark Belen","21-14345-201");
        Borrower faculty = new Faculty("Juan Dela Cruz", "21-23412-429");

        //RESOURCES [Books, Journals, Theses, etch.]
        Resource book = new Book("The New Java","978-0-596-52068-7");
        Resource journal = new Journal("The Journey Within", "1234-5679");
        Resource thesis = new Thesis("Functional Programming Languages","0000-0001-5109-3700");

        //BORROWED BOOKS
        System.out.println("BORROWED BOOKS");
        ResourceBorrower bookResource = new ResourceBorrower();
        bookResource.borrow(book, student);
        bookResource.borrow(book,faculty);

        //BORROWED JOURNALS
        System.out.println("BORROWED JOURNALS");
        ResourceBorrower journalResource = new ResourceBorrower();
        journalResource.borrow(journal, student);
        journalResource.borrow(journal, faculty);

        //BORROWED THESES
        System.out.println("BORROWED THESES");
        ResourceBorrower thesisResource = new ResourceBorrower();
        thesisResource.borrow(thesis, student);
        thesisResource.borrow(thesis, faculty);

    }
}
