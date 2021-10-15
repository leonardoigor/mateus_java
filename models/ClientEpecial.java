package models;

public class ClientEpecial {
    private Long id;
    private Double valeCompra;

    public Double getValeCompra() {
        return valeCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValeCompra(Double valeCompra) {
        this.valeCompra = valeCompra;
    }

}
