package tddlession.money;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void time(int multipler) {
        amount *= multipler;
    }
}
