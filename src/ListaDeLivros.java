import java.util.LinkedList;

class ListaDeLivros{
    LinkedList<Livro> lista;
    public ListaDeLivros(){
        lista = new LinkedList<>(); //cria a lista de livros
    }


public void AdicionarLivro (Livro livro){
    lista.add(livro); //adiciona um livro a lista fila
}

public void ImprimirLista(){ 
    System.out.println("Lista de livros: \n");
    for(Livro livro: lista){
    System.out.println(livro);
        }
    } 
}