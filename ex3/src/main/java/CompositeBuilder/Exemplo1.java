package CompositeBuilder;

public class Exemplo1 {

    public static void main(String[] args) {
        
        ComputadorBuilder builder = new ComputadorBasicoBuilder();	
        ComputadorDirector director = new ComputadorDirector(builder);
        
        Componente c1 = director.buildComputador();
      
        AceleradorGrafico aceleradorVideo = new AceleradorGrafico();
        ProcessadorGrafico pg1 = new ProcessadorGrafico();
        ProcessadorGrafico pg2 = new ProcessadorGrafico();
        aceleradorVideo.add(pg1);
        aceleradorVideo.add(pg2);
        

        System.out.println("Preço de toda a composição:");
        System.out.println("Valor: " + c1.getPrecoCusto());
        
    }
}
