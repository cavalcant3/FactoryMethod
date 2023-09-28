package ComFactory;

public class FabricaDeCarro {
    Carro carro2 = null;
    public Carro criarCarro(String carro){
       if (carro.equals("volks")){
           carro2 = new Volks();
       } else if (carro.equals("fiat")){
           carro2 = new Fiat();
        }
        return carro2;
    }
}
