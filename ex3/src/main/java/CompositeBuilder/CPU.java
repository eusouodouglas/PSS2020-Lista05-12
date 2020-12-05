package CompositeBuilder;

public class CPU extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
      
        double preco = 1000;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

    
}