public class Test {
    public static void main(String[] args) {
        Book book = new Book("Lord of the Rings");
        BookMover FromAvailableStatus = new FromAvailableStatusMover();
        BookMover FromArchivedStatus = new FromArchivedStatusMover();
        BookMover FromBorrowedStatus = new FromBorrowedstatusMover();
        BookMover FromOverduedStatus = new FromOverduedStatusMover();

        FromAvailableStatus.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        FromBorrowedStatus.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());
        FromOverduedStatus.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
        FromArchivedStatus.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
    }
}