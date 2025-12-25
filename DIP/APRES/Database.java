package DIP.APRES;

public interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

class OrderProcessor {
    private Database database;
    // Injection via constructeur
    public OrderProcessor(Database database) {
        this.database = database;
    }
    public void processOrder(String order) {
        database.save(order);
    }
}