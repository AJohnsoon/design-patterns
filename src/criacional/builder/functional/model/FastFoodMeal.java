package src.criacional.builder.functional.model;

public record FastFoodMeal(String main, String drink, String side, String dessert, String gift) {

    @Override
    public String toString() {
        return "FastFoodMeal\n{" +
                "\n 	main:'" + main + '\'' +
                "\n 	drink:'" + drink + '\'' +
                "\n 	side:'" + side + '\'' +
                "\n 	dessert:'" + dessert + '\'' +
                "\n 	gift:'" + gift + '\'' +
                "\n}";
    }


    public static class Builder {
        private String main;

        private String drink;
        private String side;
        private String dessert;
        private String gift;

        public Builder(String main) {
            this.main = main;
        }

        public Builder forDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder andSide(String side) {
            this.side = side;
            return this;
        }

        public Builder andDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder choiceToy(String gift) {
            this.gift = gift;
            return this;
        }

        public FastFoodMeal thatIsAll() {
            return new FastFoodMeal( main, drink, side, dessert, gift );
        }
    }
}
