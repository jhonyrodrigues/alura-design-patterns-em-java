package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento novo = new Orcamento();
        novo.adicionarItem(antigo);
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        System.out.println("Quantidade de itens: " + novo.getQuantidadeItens());
        System.out.println("Valor total: " + novo.getValor());
    }
}
