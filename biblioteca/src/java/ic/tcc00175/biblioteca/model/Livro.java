package ic.tcc00175.biblioteca.model;
// Generated Oct 3, 2013 6:26:57 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Livro generated by hbm2java
 */
public class Livro implements java.io.Serializable {

    private long materialCodigo;
    private Material material;
    private String editora;
    private String autores;
    private Long edicao;
    private Long anopublicacao;
    private Set reservas = new HashSet(0);

    public Livro() {
    }

    public Livro(long materialCodigo, Material material) {
        this.materialCodigo = materialCodigo;
        this.material = material;
    }

    public Livro(long materialCodigo, Material material, String editora, String autores, Long edicao, Long anopublicacao, Set reservas) {
        this.materialCodigo = materialCodigo;
        this.material = material;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anopublicacao = anopublicacao;
        this.reservas = reservas;
    }

    public long getMaterialCodigo() {
        return this.materialCodigo;
    }

    public void setMaterialCodigo(long materialCodigo) {
        this.materialCodigo = materialCodigo;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return this.autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Long getEdicao() {
        return this.edicao;
    }

    public void setEdicao(Long edicao) {
        this.edicao = edicao;
    }

    public Long getAnopublicacao() {
        return this.anopublicacao;
    }

    public void setAnopublicacao(Long anopublicacao) {
        this.anopublicacao = anopublicacao;
    }

    public Set getReservas() {
        return this.reservas;
    }

    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }
}
