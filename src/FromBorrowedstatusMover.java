public class FromBorrowedstatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");

        switch (requestedStatus) {
            case BORROWED -> {
                book.setStatus(Status.BORROWED);
                System.out.println("Книга в Пользовании");
            }
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Книга в Архиве");
            }
            case OVERDUED -> {
                book.setStatus(Status.OVERDUED);
                System.out.println("Книга задержана");
            }
            default -> System.out.println("Переход невозможен");
        }
    }
}