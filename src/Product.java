import java.util.Objects;

public class Product {
    public int id;
    public String name;
    public int price;
    public String category;
    private static int counter = 0;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        counter++;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return (id == product.id) && Objects.equals(category, product.category);

    }

    public String toString() {
        return "Товар[артикул=" + this.id +
               ", название=" + this.name +
               ", цена=" + this.price +
               ", категория=" + this.category + "]";
    }
}