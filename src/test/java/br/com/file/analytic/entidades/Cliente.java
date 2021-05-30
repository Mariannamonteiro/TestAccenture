package br.com.file.analytic.entidades;

public class Cliente {

    private int codigo;
    private String cnpj;
    private String name;
    private String business;

 
    public Cliente(int codigo, String cnpj, String name, String business) {
        super();
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.name = name;
        this.business = business;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

}
