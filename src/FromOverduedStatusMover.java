public class FromOverduedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");

        switch (requestedStatus) {
            case OVERDUED -> {
                book.setStatus(Status.OVERDUED);
                System.out.println("Книга задержана");
            }
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Книга в Архиве");
            }
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE);
                System.out.println("Книга доступна");
            }
            default -> System.out.println("Переход невозможен");
        }
    }
}