package lanchonete;

import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();

        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionaoComboNoBalcao();  // Corrigido erro de digitação

        Almoxarife almoxarife = new Almoxarife();

        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();

        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();  // Corrigido nome do método
        atendente.trocarGas();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        cliente.pegarPedidoBalcao();
        cliente.consultarSaldoAplicativo();

        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
