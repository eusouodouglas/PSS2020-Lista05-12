package CompositeBuilder;

public class AceleradorGrafico extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
        
        double preco = 500;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

   
}