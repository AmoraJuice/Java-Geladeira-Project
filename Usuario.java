public class Usuario {
public static void main(String[] args) {
            Geladeira geladeira = new Geladeira();

            //Adicionar
            geladeira.adicionarItem("Leite");
            geladeira.adicionarItem("Ovos");

            //Remover
            geladeira.removerItem ("Leite");

            //Olhar
            geladeira.exibirConteudo();
    }
}
