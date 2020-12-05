package CompositeBuilder;

public class PlacaVideo extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
        
        double preco = 520;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

   
}