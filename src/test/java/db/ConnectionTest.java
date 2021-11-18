package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ConnectionTest {

    @Test
    void createConnection() {

        Connection inst1 = Connection.getConnection();
        Connection inst2 = Connection.getConnection();

        assertSame(inst1, inst2);
    }

}
