import java.util.Queue;
import java.util.LinkedList;

class ListaDeEspera{ //fila Qeue
    private Queue <Livro> lista;

    public ListaDeEspera(){
    this.lista = new LinkedList<>();
}

public void AdicionarNaFila(Livro livro){
    lista.add(livro);
}

public Livro proximo(){
   return lista.poll(); //remove o primeiro elemento da fila

}
 public boolean estaVazia() {
        return lista.isEmpty(); // verifica se a fila está vazia
    }

public void imprimirListaDeEspera(){
    System.out.println("-------------------");
    System.out.println("Lista de Espera: \n");
     for(Livro livro: lista){
        System.out.println(livro);
     }
}
}