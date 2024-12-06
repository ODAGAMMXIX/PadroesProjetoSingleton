public final class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {
        // Configuração inicial do logger
    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void log(String message) {
        // Implementação do log (arquivo, console, etc.)
        System.out.println(message);
    }
}
