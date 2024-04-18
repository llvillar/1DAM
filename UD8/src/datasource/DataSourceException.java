package datasource;

import java.io.Serial;

public class DataSourceException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public DataSourceException(String msg) {
        super(msg);
    }
}