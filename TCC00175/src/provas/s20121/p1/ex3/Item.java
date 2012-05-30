package provas.s20121.p1.ex3;

public abstract class Item {

    public static float total = 0;

    public abstract String parse(String pedido, float desconto) throws Exception;

    public float valor(String pedido, float desconto) throws Exception {
        total = 0;
        parse(pedido, desconto);
        return total;
    }
}
