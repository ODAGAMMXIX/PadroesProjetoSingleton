public final class ConfigurationManager {
    private static final ConfigurationManager INSTANCE = new ConfigurationManager();

    private Properties config = new Properties();

    private ConfigurationManager() {
        // Carregar configurações de um arquivo, banco de dados, etc.
        config.setProperty("url", "https://example.com");
        config.setProperty("timeout", "5000");
    }

    public static ConfigurationManager getInstance() {
        return INSTANCE;
    }

    public String getProperty(String key) {
        return config.getProperty(key);
    }
}

public class Main { 
    public static void main(String[] args) {
        
ConfigurationManager configManager = ConfigurationManager.getInstance();
String url = configManager.getProperty("url");

    }
}
