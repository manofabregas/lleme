package exercicios.letreiro.mostrador1;

import exercicios.letreiro.Caractere;

public class U extends Caractere {

    private static U instancia = null;

    private U() {

    }

    public static U obterInstancia() {
        if (instancia == null)
            instancia = new U();
        return instancia;
    }

    @Override
    public void acenderLedsMostrador1(Mostrador1 mostrador1) {
        boolean[][] estados
                = {{true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {false, true, true, true, false}};
        mostrador1.acenderLeds(estados);
    }
    
}
