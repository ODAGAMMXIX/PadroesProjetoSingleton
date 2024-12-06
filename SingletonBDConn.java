public final class DatabaseConnection {
    private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    private Connection connection;

    private DatabaseConnection() {
        try {
            // Configuração da conexão com o banco de dados
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
}
public class Main { 
    public static void main(String[] args) {

Connection conn = DatabaseConnection.getInstance().getConnection();
// Realizar operações no banco de dados

    }
}
