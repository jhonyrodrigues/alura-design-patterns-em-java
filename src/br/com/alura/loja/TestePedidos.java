package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.GerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedidos;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedidos {
    public static void main(String[] args) {

        String cliente = "Pedro";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido(), new LogDePedidos())
        );

        handler.execute(gerador);
    }
}
