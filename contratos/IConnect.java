package contratos;

public interface IConnect {

    public void open();

    public void close();

    public void connect(IDbEntity dbConf);
}
