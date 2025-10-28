abstract class IngredienteDecorador implements Pizza {
    protected Pizza pizza;

    public IngredienteDecorador(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
    @Override
    public int getCost() {
        return pizza.getCost();
    }
}

class Queso extends IngredienteDecorador {
    public Queso(Pizza pizza) { super(pizza); }
    @Override
    public String getDescription() { return pizza.getDescription() + "con Queso"; }
    @Override
    public int getCost() { return pizza.getCost() + 5000; }
}

class Pepperoni extends IngredienteDecorador {
    public Pepperoni(Pizza pizza) { super(pizza); }
    @Override
    public String getDescription() { return pizza.getDescription() + "con Pepperoni"; }
    @Override
    public int getCost() { return pizza.getCost() + 7000; }
}

class Aceitunas extends IngredienteDecorador {
    public Aceitunas(Pizza pizza) { super(pizza); }
    @Override
    public String getDescription() { return pizza.getDescription() + "con Aceitunas"; }
    @Override
    public int getCost() { return pizza.getCost() + 4000; }
}

class Tocineta extends IngredienteDecorador {
    public Tocineta(Pizza pizza) { super(pizza); }
    @Override
    public String getDescription() { return pizza.getDescription() + "con Tocineta"; }
    @Override
    public int getCost() { return pizza.getCost() + 6000; }
}
