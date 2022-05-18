package br.com.ProjetoMercearia.modelo;


public class Fornecedor {

    private Integer codigo;
    private String razaoSocial;
    private String email;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(Integer codigo, String razaoSocial, String email, String telefone) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    

}
