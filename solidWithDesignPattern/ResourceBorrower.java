public class ResourceBorrower {

    public void borrow(Resource resource, Borrower borrower){
        System.out.println("Borrower name: " + borrower.getBorrowerName());
        System.out.println("Borrower ID: " + borrower.getBorrowerId());
        System.out.println("Resource Title: " + resource.getTitle());
        System.out.println("Resource ID: " + resource.getResourceId());
        System.out.println();

    }
}
