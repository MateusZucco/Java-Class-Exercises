public class Contador {
    public double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Contador(double valor) {
        this.valor = valor;
    }

    public void zerar(){
        this.setValor(0);
    }

    public void incrementar (double valorIncremento){
        this.setValor(this.getValor() + valorIncremento);
    }

    public double retorna (){
        return this.getValor();
    }
}
