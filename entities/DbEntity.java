package entities;

import contratos.IDbEntity;

public class DbEntity extends IDbEntity {

    public DbEntity(String url, String dbName, String userCon, String userPass) {
        super(url, dbName, userCon, userPass);
    }

    public boolean isValid() {

        return this.dbName.length() > 4;
    }

}
