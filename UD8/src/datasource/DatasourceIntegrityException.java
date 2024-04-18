package datasource;

public class DatasourceIntegrityException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatasourceIntegrityException(String msg) {
        super(msg);
    }
}