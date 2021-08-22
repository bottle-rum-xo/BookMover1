public class FromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");

        switch (requestedStatus) {
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED);
                System.out.println("Книга в Архиве");
                break;
            case AVAILABLE:
                book.setStatus(Status.AVAILABLE);
                System.out.println("Книга доступна");
            default:
                System.out.println("Переход невозможен");
        }
    }
}