package src.criacional.prototype.v3.model;

public record FastFood(String main, String drink, String gift) implements Cloneable {
    @Override
    public String toString() {
        return "FastFood{" +
                "\n   Main: " + main +
                "\n   Drink: " + drink +
                "\n   Gift: " + gift +
                "\n}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Builder cloneBuilder() {
        return new Builder(main, drink, gift);
    }

    public static class Builder {
        private String main;
        private String drink;
        private String gift;

        public Builder(String main, String drink, String gift) {
            this.main = main;
            this.drink = drink;
            this.gift = gift;
        }

        public Builder toEat(String main) {
            this.main = main;
            return this;
        }

        public Builder toDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder selectedGift(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFood thatIsAll() {
            return new FastFood(main, drink, gift);
        }
    }
}
