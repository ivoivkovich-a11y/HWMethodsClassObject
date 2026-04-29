//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Product product1 = new Product(12, "Помидоры", 350, "Овощи");
    Product product2 = new Product(12, "Помидоры", 350, "Овощи");
    System.out.println(product1.toString());
    System.out.println(product2.toString());
    Product product3 = new Product(13, "Картошка", 45, "Овощи");
    System.out.println(product3.toString());
    System.out.println("Objects.equals(product1,product2) = " + Objects.equals(product1, product2));
    System.out.println("Objects.equals(product1,product3) = " + Objects.equals(product1, product3));
    System.out.println("Objects.equals(product2,product3) = " + Objects.equals(product2, product3));
    Order order1 = new Order("Vitya", new Product[]{product1, product3});
    Order order2 = new Order("Vitya", new Product[]{product1, product3});
    System.out.println("order1 = " + order1);
    System.out.println("order2 = " + order2);
    System.out.println("order1.equals(order2) = " + order1.equals(order2));

}
