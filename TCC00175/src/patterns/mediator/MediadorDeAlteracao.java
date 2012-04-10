package patterns.mediator;

import patterns.memento.Memento;
import patterns.visitor.InicializarVariavel;
import patterns.visitor.ListaVariaveis;

public class MediadorDeAlteracao extends Mediador {

    public Expressao expressao;
    public MapaVariaveis mapaVariaveis;

    public class MementoMediador implements Memento {

        private Expressao expressao;
        private MapaVariaveis mapaVariaveis;

    }
    
    public Memento createMemento() throws CloneNotSupportedException{
        MementoMediador m = new MementoMediador();
        m.expressao=expressao.clone();
        m.mapaVariaveis=mapaVariaveis.clone();
        return m;
    }
    
    public void setMemento(Memento m) throws ClassCastException{
        expressao=((MementoMediador)m).expressao;
        mapaVariaveis=((MementoMediador)m).mapaVariaveis;
    }

    @Override
    public void objetoAlterado(ClasseMediada objetoMediado) {
        if (objetoMediado == expressao)
            objetoCalculoAlterado((Expressao) objetoMediado);
        else
            objetoCalculoAlterado((MapaVariaveis) objetoMediado);
    }

    public Expressao getEditorExpressao() {
        return expressao;
    }

    public MapaVariaveis getEditorVariaveis() {
        return mapaVariaveis;
    }

    public void objetoCalculoAlterado(Expressao mediado) {
        ListaVariaveis v = new ListaVariaveis();
        expressao.expressao.accept(v);
        mapaVariaveis.updateVars(v.nomesVars);
    }

    public void objetoCalculoAlterado(MapaVariaveis mediado) {
        for (String nome : mapaVariaveis.listVarsNames())
            expressao.expressao.accept(new InicializarVariavel(nome, mapaVariaveis.getVar(nome)));
    }

    @Override
    public void criarClassesRelacionadas() {
        expressao = new Expressao(this);
        mapaVariaveis = new MapaVariaveis(this);
    }

    public void setExpressaoStr(String expressaoStr) throws Exception {
        expressao.setExpressaoStr(expressaoStr);
    }

    public void setVar(String varName, Double valor) {
        mapaVariaveis.setVar(varName, valor);
    }
}