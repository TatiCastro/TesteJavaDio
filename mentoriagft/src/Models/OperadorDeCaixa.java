package Models;

import Models.Endereco;
import Models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }
     public OperadorDeCaixa (){

     };

    @Override
    public String toString() {
        return "Models.OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
