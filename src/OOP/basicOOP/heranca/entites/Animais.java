package OOP.basicOOP.heranca.entites;

public class Animais {

    private String nome;
    private Double comprimento;
    private Integer numPatas;
    private String ambiente;
    private Double velocidade;


    public Animais(){}

    public Animais(Double comprimento, String ambiente,
                   String nome, Integer numPatas,
                   Double velocidade) {

        this.comprimento = comprimento;
        this.ambiente = ambiente;
        this.nome = nome;
        this.numPatas = numPatas;
        this.velocidade = velocidade;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(Integer numPatas) {
        this.numPatas = numPatas;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public void dados(){
        System.out.printf("Dados do animal %s\n\n", nome);
        System.out.printf("Comprimento: %f \n", comprimento);
        System.out.printf("Número de patas: %d\n", numPatas);
        System.out.printf("Ambiente em que vive: %s\n", ambiente);
        System.out.printf("Velocidade média: %f\n", velocidade);
    }
}
