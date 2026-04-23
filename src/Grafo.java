import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Grafo {
    private HashMap<Livro, Set<Livro>> relacoes;

    public Grafo() {
        relacoes = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        relacoes.put(livro, new HashSet<>());
    }

    public void adicionarRelacao(Livro origem, Livro destino) {
        if (relacoes.containsKey(origem) && relacoes.containsKey(destino)) {
            relacoes.get(origem).add(destino);
            relacoes.get(destino).add(origem);
        }
    }

    public void imprimirGrafo() {
        System.out.println("-------------------");
        System.out.println("Recomendações baseado na relação dos livros: \n");
        for (Livro livro : relacoes.keySet()) {
            System.out.println(" >>> O livro " + livro.getTitulo() + " tem relação com: ");
            for (Livro relacionado : relacoes.get(livro)) {
                System.out.println("  - " + relacionado.getTitulo());
            }
        }
    }
}