import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepoTest {
    @Test
    public void RemoveExistedProduct() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "bra", 25);
        Product product2 = new Product(2, "pillow", 250);
        Product product3 = new Product(3, "book", 2);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        repo.remove(3);
        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RemoveNotExistedProduct() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "bra", 25);
        Product product2 = new Product(2, "pillow", 250);
        Product product3 = new Product(3, "book", 2);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(55)
        );
    }


}
