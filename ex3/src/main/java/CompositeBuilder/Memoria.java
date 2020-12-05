package CompositeBuilder;

public class Memoria extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
        
        double preco = 80;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

   
}