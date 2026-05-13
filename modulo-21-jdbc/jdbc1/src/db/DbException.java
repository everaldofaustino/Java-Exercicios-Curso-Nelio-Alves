package db;  // ou o package que você está usando

import java.io.Serializable;

public class DbException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbException(String msg) {
        super(msg);
    }
}