package sanduiche;

public class SanduicheDirector {

    SanduicheBuilder builder;

    public SanduicheDirector(SanduicheBuilder builder) {
        this.builder = builder;
    }

    public Componente buildSanduiche() {
        builder.createSanduiche();
        builder.addCarne();
        builder.addIngredientes();
        return builder.getSanduiche();
    }
}
