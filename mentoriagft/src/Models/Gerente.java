package Models;

import Models.CalculaBonificacao;
import Models.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Models.Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                ", valorBonificacao=" + this.valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }
}


