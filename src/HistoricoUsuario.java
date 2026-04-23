import java.util.Stack;

class HistoricoUsuario{ // pilha Stack
    private Stack <Livro> historico;
 
    public HistoricoUsuario(){
        this.historico = new Stack<>(); 

    }

    public void visualizadorLivro(Livro livro){
        historico.push(livro); //empilhando o livro visualizado 
    }

    public Livro ultimoVisualizado(){ 
        if (!historico.isEmpty())
         return historico.peek(); //consulta o ultimo visualizado sem tirar da pilha
    return null;
    }

    public Livro voltarNavegacao(){
            if(!historico.isEmpty())
                return historico.pop(); //tira o topo da pilha simulando um "voltar"
        return null;
    }

    public boolean estaVazio(){ //verifica se a pilha esta vazia
        return historico.isEmpty();
    }
}