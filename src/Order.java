import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "customer='" + customer +
               ", basket=" + Arrays.toString(basket);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Order order = (Order) o;
       if (!Objects.equals(customer, order.customer)) {
            return false;
        }
       if (this.basket == null || basket == null) {
           return false;
       }
        if (this.basket == null && basket == null) {
            return true;
        }
       if (this.basket.length != order.basket.length) {
           return false;
       }
       for (int i = 0; i < this.basket.length; i++) {
           Product product1 = this.basket[i];
           Product product2 = order.basket[i];
           if (product1 == null && product2 == null) {
               return true;
           }
           if (product1 == null || product2 == null){
               return false;
           }
            if (!product1.equals(product2)) {
               return false;
           }
       }
       return true;
    }

}

