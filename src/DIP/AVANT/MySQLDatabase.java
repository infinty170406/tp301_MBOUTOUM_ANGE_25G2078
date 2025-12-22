package DIP.AVANT;

public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class OrderProcessor {
    private MySQLDatabase database;
    public OrderProcessor() {
        this.database = new MySQLDatabase(); // Couplage fort
    }
    public void processOrder(String order) {
        database.save(order);
    }
}