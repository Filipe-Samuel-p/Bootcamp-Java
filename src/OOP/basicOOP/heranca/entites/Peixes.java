package OOP.basicOOP.heranca.entites;

public class Peixes extends Animal {

    private String caracteristicas;

    public Peixes(){
        super();
    }

    public Peixes(Double comprimento, String ambiente, String nome,
                  Integer numPatas, Double velocidade, String caracteristicas) {

        super(comprimento, ambiente, nome, numPatas, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.printf("Caracteristicas: %s", caracteristicas);
    }
}
