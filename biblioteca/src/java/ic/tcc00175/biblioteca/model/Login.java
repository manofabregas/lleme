package ic.tcc00175.biblioteca.model;
// Generated Oct 3, 2013 6:26:57 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Login generated by hbm2java
 */
public class Login implements java.io.Serializable {

    private long id;
    private Usuario usuario;
    private String nome;
    private String senha;
    private Date expiracao;

    public Login() {
    }

    public Login(long id, Usuario usuario, String nome) {
        this.id = id;
        this.usuario = usuario;
        this.nome = nome;
    }

    public Login(long id, Usuario usuario, String nome, String senha, Date expiracao) {
        this.id = id;
        this.usuario = usuario;
        this.nome = nome;
        this.senha = senha;
        this.expiracao = expiracao;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getExpiracao() {
        return this.expiracao;
    }

    public void setExpiracao(Date expiracao) {
        this.expiracao = expiracao;
    }
}
