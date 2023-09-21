public class TestaFatura {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("00001", "teste", 2, 2.0);
        System.out.println(fatura.toString());
        double valorFatura = fatura.getQuantidadeFatura();
        System.out.println(valorFatura);

        System.out.println("\n");

        Fatura fatura2 = new Fatura("00001", "teste", 0, 0.0);
        fatura2.setPreco(-2);
        fatura2.setQuantidade(-5);
        System.out.println(fatura2.toString());
        double valorFatura2 = fatura2.getQuantidadeFatura();
        System.out.println(valorFatura2);
    }
}
