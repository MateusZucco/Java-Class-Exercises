import java.util.Date;

public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private Date dataDeNascimento;
    private int numero;
    private String posicao;
    private int cartoes;
    private boolean suspenso;
    public int getId() {
        return id;
    }

    public Jogador(int id, String nome, String apelido, Date dataDeNascimento, int numero, String posicao, int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    public void aplicaCartao(int quantidade){
        this.setCartoes(quantidade);
        if(this.getCartoes() > 2){
            this.setSuspenso(true);
        }
    }

    public void cumpreSuspencao(){
        this.setCartoes(0);
        this.setSuspenso(false);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", numero=" + numero +
                ", posicao='" + posicao + '\'' +
                ", cartoes=" + cartoes +
                ", suspenso=" + suspenso +
                '}';
    }
}
