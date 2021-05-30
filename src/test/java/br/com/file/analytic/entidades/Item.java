package br.com.file.analytic.entidades;

public class Item {

    private int id;
    private int quantidade;
    private double precoUnit;
    private double totalPorItem;

   
    public Item(int id, int quantidade, double precoUnit, double totalPorItem) {
        super();
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnit = precoUnit;
        this.totalPorItem = totalPorItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public double getTotalPorItem() {
        return totalPorItem;
    }

    public void setTotalPorItem(double totalPorItem) {
        this.totalPorItem = totalPorItem;
    }

}
