public abstract class CoffeeDecorator implements Coffee {
    private Coffee wrappedCoffee;

    public CoffeeDecorator(Coffee wrappedCoffee) {
        setWrappedCoffee(wrappedCoffee);
    }

    public void setWrappedCoffee(Coffee wrappedCoffee) {
        if (wrappedCoffee == null) {
            throw new IllegalArgumentException("Wrapped coffee must not be null.");
        }
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost();
    }
}
