package PadraoSemFactory;

public class Fiat extends FacricaDeCarros{
    @Override
    public void criarCarro() {
        System.out.println("Criando carro Fiat");
    }
}
