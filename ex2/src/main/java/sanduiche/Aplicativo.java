package sanduiche;

import ingredientes.Bacon;
import ingredientes.Ovo;
import ingredientes.Passas;
import java.text.NumberFormat;
import java.util.Locale;

public class Aplicativo {

    public static void main(String[] args) {
        
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		
        SanduicheBuilder builder = new SanduicheBasicoBuilder();
		
        SanduicheDirector director = new SanduicheDirector(builder);
		
        Componente sanduiche = director.buildSanduiche();

        sanduiche = new Passas(sanduiche);
        sanduiche = new Bacon(sanduiche);
        sanduiche = new Ovo(sanduiche);
        
        System.out.println(sanduiche.getDescricao());
        System.out.println("Preço final do sanduiche " + dinheiro.format(sanduiche.getPreco()));
        
    }
}
