public class Horario {
    private int hora;

    private int minuto;

    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String exibe(){
        String texto = this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo();
        System.out.println(texto);
        return texto;
    }

    public int calculaSegundo(){
        return this.getHora() * 3600 + this.getMinuto() * 60 + this.getSegundo();
    }
}
