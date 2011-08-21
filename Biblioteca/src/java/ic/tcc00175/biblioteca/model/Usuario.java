/* Generated by Together */
package ic.tcc00175.biblioteca.model;

import ic.tcc00175.biblioteca.model.patterns.adapter.EmprestimoColecao;
import ic.tcc00175.biblioteca.model.patterns.adapter.OperacaoColecao;
import ic.tcc00175.biblioteca.model.patterns.adapter.ReservaColecao;

import java.io.Serializable;
import java.util.Date;

public abstract class Usuario extends BusinessObject {

    public Usuario() {
        this.key = new Key();
        this.lnkEmprestimo = new EmprestimoColecao();
        this.lnkReserva = new ReservaColecao();
        this.lnkOperacao = new OperacaoColecao(this);
    }

    public void setKey(int id) {
        setId(id);
    }

    public Comparable getKey() {
        return this.key;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
        this.key.idK = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Date getCancelamento() {
        return cancelamento;
    }

    public void setCancelamento(Date cancelamento) {
        this.cancelamento = cancelamento;
    }

    public int getQtdEmprestimo() {
        return 0;
    }

    public int getTempoEmprestimo() {
        return 0;
    }

    public ReservaColecao getLnkReserva() {
        return lnkReserva;
    }

    public void setLnkReserva(ReservaColecao lnkReserva) {
        this.lnkReserva = lnkReserva;
        this.lnkOperacao.setCollection(this);
    }

    public EmprestimoColecao getLnkEmprestimo() {
        return lnkEmprestimo;
    }

    /**
     * @return Returns the lnkOperacao.
     */
    public OperacaoColecao getLnkOperacao() {
        return lnkOperacao;
    }

    public boolean atingiuLimiteReserva() {
        if (getLnkReserva().size() < Reserva.limite)
            return false;
        return true;
    }

    public boolean atingiuLimiteEmprestimo() {
        if (getLnkEmprestimo().sizePendentes() < getQtdEmprestimo())
            return false;
        return true;
    }
    private long id = 0;

    private class Key implements Comparable, Serializable {

        /**
         * 
         */
        private static final long serialVersionUID = -7265100949117553088L;
        private long idK = 0;

        public int compareTo(Object o) {
            if (o != null) {
                Key key = (Key) o;
                Long keyId = new Long(key.idK);
                Long thisId = new Long(this.idK);
                return thisId.compareTo(keyId);
            }
            return 1;
        }
    }
    private Key key = null;
    private String nome = null;
    private long telefone = 0;
    private long celular = 0;
    private String email = null;
    private long cpf = 0;
    private String logradouro = null;
    private String complemento = null;
    private String bairro = null;
    private String cidade = null;
    private int cep = 0;
    private Date admissao = null;
    private Date cancelamento = null;
    private EmprestimoColecao lnkEmprestimo = null;
    private ReservaColecao lnkReserva = null;
    private OperacaoColecao lnkOperacao = null;

    public void setLnkEmprestimo(EmprestimoColecao lnkEmprestimo) {
        this.lnkEmprestimo = lnkEmprestimo;
        this.lnkOperacao.setCollection(this);
    }
}
