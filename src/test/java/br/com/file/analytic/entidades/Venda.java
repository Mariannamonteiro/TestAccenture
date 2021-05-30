package br.com.file.analytic.entidades;

public class Venda {

    private int codigo;
    private int idVenda;
    private String nomeVendedor;
    private double total;

    public Venda(int codigo, int idVenda, String nomeVendedor, double total) {
        super();
        this.codigo = codigo;
        this.idVenda = idVenda;
        this.nomeVendedor = nomeVendedor;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
