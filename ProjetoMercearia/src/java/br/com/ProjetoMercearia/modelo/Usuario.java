package br.com.ProjetoMercearia.modelo;

import java.time.LocalDate;

public class Usuario {
    
    private Integer codigo;
    private String nome;
    private String senha;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;

    public Usuario(Integer codigo, String nome, String senha, LocalDate dataNascimento, LocalDate dataCadastro) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    public Usuario() {
        
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
    
}
