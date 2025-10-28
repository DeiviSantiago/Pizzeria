public interface Pizza {
    String getDescription();
    int getCost();
}

// Clase base de la pizza
class PizzaBase implements Pizza {
    private String tamaño;
    private int costo;

    public PizzaBase(String tamaño) {
        this.tamaño = tamaño.toLowerCase();
        switch (this.tamaño) {
            case "mediana": this.costo = 19900; break;
            case "grande": this.costo = 29900; break;
            case "extragrande": this.costo = 39900; break;
            default: this.tamaño = "mediana"; this.costo = 19900; break;
        }
    }

    @Override
    public String getDescription() {
        return "Pizza Base " + tamaño;
    }
    @Override
    public int getCost() {
        return costo;
    }
}
