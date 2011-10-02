package patterns.chainOfResponsabilities;

import java.util.Scanner;
import org.omg.CORBA.UserException;
import patterns.interpreter.Expressao;
import patterns.interpreter.Seno;

public class FragmentadorSeno extends FragmentadorDeExpressao {

    @Override
    public String extrairSimbolo(String expressaoStr) throws UserException {
        Scanner in = new Scanner(expressaoStr.trim());
        Expressao op1;
        if (in.hasNext("sen")) {
            in.next("sen");
            if (pilha.size() >= 1) {
                op1 = pilha.pop();
                pilha.add(new Seno(op1));
                if (in.hasNextLine()) {
                    String resto = in.nextLine().trim();
                    if (resto.equals(""))
                        return null;
                    else
                        return resto;
                } else
                    return null;
            } else
                throw new UserException("N�mero inv�lido de operandos para a opera��o seno") {
                };
        } else if (proximo != null)
            return proximo.extrairSimbolo(expressaoStr);
        else
            return expressaoStr;
    }
}
