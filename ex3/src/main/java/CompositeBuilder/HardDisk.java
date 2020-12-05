package CompositeBuilder;

public class HardDisk extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
        
        double preco = 150;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

   
}