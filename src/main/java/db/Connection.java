package db;

public class Connection {
    private static Connection inst;

    private Connection() {
    }

    public static Connection getConnection() {
        if (inst == null) {
            inst = new Connection();
        }

        return inst;
    }
}
