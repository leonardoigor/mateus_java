package contratos;

import java.util.Calendar;

import models.Compras;

public interface Vetor {

    public Compras get(int pos);

    public void insere(Compras compra);

    public void remove(String cpf, Calendar data);
}
