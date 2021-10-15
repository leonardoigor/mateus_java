package models;

import java.util.Calendar;
import java.util.List;

import contratos.Ordenacao;
import contratos.Vetor;

public class CadCompra implements Ordenacao, Vetor {

    private Long id;
    private List<Compras> vetCompra;

    public List<Compras> getVetCompra() {
        return vetCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVetCompra(List<Compras> vetCompra) {
        this.vetCompra = vetCompra;
    }

    @Override
    public void insercaoDereta() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void quickComInsercao() {

    }

    @Override
    public void shellShort() {

    }

    // TODO Vetor
    @Override
    public Compras get(int pos) {

        return null;
    }

    @Override
    public void insere(Compras compra) {

    }

    @Override
    public void remove(String cpf, Calendar data) {

    }

}
