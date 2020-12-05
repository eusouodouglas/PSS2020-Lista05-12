package CompositeBuilder;

public class PlacaMae extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
       
        double preco = 320;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

   
}