package ic.tcc00175.biblioteca.model;
// Generated Oct 3, 2013 6:26:57 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Tipo generated by hbm2java
 */
public class Tipo implements java.io.Serializable {

    private long codigo;
    private String descricao;
    private Set usuarios = new HashSet(0);

    public Tipo() {
    }

    public Tipo(long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Tipo(long codigo, String descricao, Set usuarios) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.usuarios = usuarios;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
}
