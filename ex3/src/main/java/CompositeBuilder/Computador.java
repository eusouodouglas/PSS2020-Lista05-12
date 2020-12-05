package CompositeBuilder;

public class Computador extends ComponenteComposite {

    @Override
    public double getPrecoCusto() {
       
        double preco = 0;
        for (Componente c : componentes) {
            preco += c.getPrecoCusto();
        }
        return preco;
    }

   
}