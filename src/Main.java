public class Main {
    public static void main(String[] args) {
        Coffee blackCoffee = new BlackCoffee();
        printOrder(blackCoffee);

        Coffee withMilk = new Milk(new BlackCoffee());
        printOrder(withMilk);

        Coffee withCaramel = new CaramelSyrup(new BlackCoffee());
        printOrder(withCaramel);

        Coffee withMilkAndCaramel = new CaramelSyrup(new Milk(new BlackCoffee()));
        printOrder(withMilkAndCaramel);
    }

    private static void printOrder(Coffee coffee) {
        System.out.printf("%s - PHP %.2f%n", coffee.getDescription(), coffee.getCost());
    }
}
