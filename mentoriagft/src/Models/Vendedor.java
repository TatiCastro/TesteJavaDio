package Models;

import Models.CalculaBonificacao;
import Models.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Models.Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorBonificacao=" + valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
}
