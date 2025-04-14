package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){ 
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoNoBalcao(){ 
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionaoComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    public void prepararVitamina(){ 
        System.out.println("PREPARANDO VITAMINA DE BANANA");
    }

    public void anotarPedido(){
        System.out.println("ANOTANDO PEDIDO");
    }

    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO PÃO, SALADA, OVO, HAMBURGUER");
    }

    public void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO CARNE E OVO PARA O HAMBURGUER");
    }

    public void pedirParaTrocarGas (Atendente atendente){
        atendente.trocarGas();
    }

    public void pedirParaTrocarGas (Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

    public void lavarIngredientes(){ 
        System.out.println("LAVANDO OS INGREDIENTES");
    }

    public void adicionaoComboNoBalcao(){
        System.out.println("COMBO COLOCADO NO BALCÃO");
    }
}
