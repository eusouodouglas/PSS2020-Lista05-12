package CompositeBuilder;

public class ComputadorDirector {

    ComputadorBuilder builder;

    public ComputadorDirector(ComputadorBuilder builder) {
        this.builder = builder;
    }

    public Componente buildComputador() {
        builder.createComputador();
        builder.addPecas();
        
        return builder.getComputador();
    }
}
