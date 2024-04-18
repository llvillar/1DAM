package datasource;

public class DataSourceIntegrityException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DataSourceIntegrityException(String msg) {
        super(msg);
    }
}