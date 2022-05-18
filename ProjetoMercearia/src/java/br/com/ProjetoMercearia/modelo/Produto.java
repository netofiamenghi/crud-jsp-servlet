package br.com.ProjetoMercearia.modelo;

public class Produto {
    
    //Atributos da Classe
    private Double valor;
    private Integer codigo;
    private String nome;
    private Integer qtdEstoque;

    //Métodos construtores
    public Produto() {
    }

    public Produto(Double valor, Integer codigo, String nome, Integer qtdEstoque) {
        this.valor = valor;
        this.codigo = codigo;
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        
        
    }
    //Getter e Setter
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    
}
