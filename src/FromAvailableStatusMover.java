public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");

        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(Status.AVAILABLE);
                System.out.println("Книга доступна");
            }
            case ARCHIVED -> {
                book.setStatus(Status.ARCHIVED);
                System.out.println("Книга в Архиве");
            }
            case BORROWED -> {
                book.setStatus(Status.BORROWED);
                System.out.println("Книга в пользовании");
            }
            default -> System.out.println("Переход невозможен");
        }
    }
}