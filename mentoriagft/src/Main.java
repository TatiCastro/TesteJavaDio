import Models.Endereco;
import Models.Gerente;
import Models.OperadorDeCaixa;
import Models.Vendedor;

public class Main {
    public static void main(String[] args) {

        /*Models.Endereco endereco = new Models.Endereco();
        endereco.setRua("Endereço para essa rua");

        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Rua funcionário", "Complemento endereço funcionário", "bairro funcionário");

        System.out.println("----");
        System.out.println(endereco);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Tati");
        vendedor.setDocumento("321.123.345-99");
        vendedor.setValorSalario(10000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println("----");
        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Tati operador", "321.123.567-88", 1000d, endereco);
        System.out.println("----");
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Tati Models.Gerente");
        gerente.setDocumento("123.456.789-10");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(gerente);
    }
}
