package OOP.basicOOP.heranca.entites;

public class Mamiferos extends Animal {

    private String alimento;

    public Mamiferos(){
        super();
    }

    public Mamiferos(Double comprimento, String ambiente,
                     String nome, Integer numPatas,
                     Double velocidade, String alimento) {

        super(comprimento, ambiente, nome, numPatas, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados(){
        super.dados();
        System.out.printf("Alimento: %s", alimento);
    }
}
