public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Не существует товара с id " + id);
    }
}
