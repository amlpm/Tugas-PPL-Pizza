package Pizza;

public class main {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();

        pizza = new Cheese(pizza);
        pizza = new Pepperoni(pizza);
        pizza = new Tuna(pizza);
        pizza = new Pepper(pizza);

        System.out.println("Description order: " + pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice() + "p");
    }
}
