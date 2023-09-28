package PadraoSemFactory;

public class Teste {
    public static void main(String[] args) {
        String carro= "volks";
        FacricaDeCarros facricaDeCarros = new FacricaDeCarros();

        //Instanciando a classe diretamente na main
        if (carro.equals("volks")){
            facricaDeCarros = new Volks();
        } else if (carro.equals("Fiat")){
            facricaDeCarros = new Fiat();
            System.out.println(facricaDeCarros);
        }
        //chamando o metodo para saber qual carro foi criado
        facricaDeCarros.criarCarro();

    }
}
