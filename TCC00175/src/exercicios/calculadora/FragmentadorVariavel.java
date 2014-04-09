package exercicios.calculadora;

import java.util.Scanner;
import exercicios.calculadora.Variavel;

public class FragmentadorVariavel extends FragmentadorDeExpressao {

  @Override
  public String extrairSimbolo(String expressaoStr) throws Exception {
    if (expressaoStr == null)
      return null;
    Scanner in = new Scanner(expressaoStr.trim());
    if (in.hasNext("_[a-z]+")) {
      getPilha().add(new Variavel(in.next("_[a-z]+")));
      if (in.hasNextLine()) {
        String resto = in.nextLine().trim();
        if (resto.equals(""))
          return null;
        else
          return resto;
      } else
        throw new Exception("N�mero inv�lido de operandos para a opera��o de soma") {
        };
    } else if (proximo != null)
      return proximo.extrairSimbolo(expressaoStr);
    else
      return expressaoStr;
  }
}
