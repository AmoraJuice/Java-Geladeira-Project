import java.util.ArrayList;
import java.util.List;

public class Geladeira {
    private List<String> itens;

    public Geladeira() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println(item + " adicionado a geladeira.");
    }

    public void removerItem(String item) {
        if (itens.remove(item)) {
            System.out.println(item + " retirado da geladeira.");
        } else {
            System.out.println(item + " não encontrado na geladeira.");
        }
    }
    public void exibirConteudo() {
        System.out.println("Conteudo da geladeira");
        for (String item : itens) {
            System.out.println("- " + item);
        }
    }
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira();

            geladeira.adicionarItem("Leite");
            
    }
}
