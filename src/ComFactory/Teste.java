package ComFactory;

public class Teste {

    public static void main(String[] args) {
        FabricaDeCarro fabricaDeCarro = new FabricaDeCarro();
        Carro carro = fabricaDeCarro.criarCarro("volks");
        carro.exibirModelo();
    }
}
