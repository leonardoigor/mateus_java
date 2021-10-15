package contratos;

public abstract class IDbEntity {
    public String url;
    public String dbName;
    public String userCon;
    public String userPass;

    public IDbEntity(String url, String dbName, String userCon, String userPass) {
        this.url = url;
        this.dbName = dbName;
        this.userCon = userCon;
        this.userPass = userPass;
    }
}
