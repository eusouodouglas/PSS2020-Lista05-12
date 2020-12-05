package CompositeBuilder;



public class ComputadorBasicoBuilder extends ComputadorBuilder {

    @Override
    public void createComputador() {
        componente = new CPU();
    }

    @Override
    public void addPecas() {
        PlacaMae placaMae = new PlacaMae();
        Memoria memoria = new Memoria();
        CPU cpu = new CPU();
        placaMae.add(memoria);
        placaMae.add(cpu);
        
        componente = placaMae;
       
    }

   

}
