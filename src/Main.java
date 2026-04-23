public class Main{ 
    public static void main(String[] args ) {
     ListaDeLivros minhalista = new ListaDeLivros();
     minhalista.AdicionarLivro(new Livro("Entendendo Algoritmos", 2017, "Aditya Y. Bhargava"));
     minhalista.AdicionarLivro(new Livro("Sapiens", 2011, "Yuval Harari"));
     minhalista.AdicionarLivro(new Livro("Codigo Limpo", 2008, "Robert C. Martin"));
     minhalista.AdicionarLivro(new Livro("Game Of Thrones", 2003, "George G. Martin"));
     minhalista.AdicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", 1997, " J.K. Rowling"));
     minhalista.AdicionarLivro(new Livro("Malala, a menina que queria ir para a escola", 2015, "Adriana Carranca"));
     minhalista.AdicionarLivro(new Livro("1984", 1949, "George Owell"));
     minhalista.AdicionarLivro(new Livro("Extraordinário", 2012, "Jaramillo Palacio"));
     minhalista.AdicionarLivro(new Livro("Diário de um Banana", 2007, "Jeff Kinney"));
     minhalista.AdicionarLivro(new Livro("A Menina que Roubava Livros", 2005, "Markus Zusak"));
     minhalista.ImprimirLista();

     ListaDeEspera listaespera = new ListaDeEspera();
     listaespera.AdicionarNaFila(new Livro("Sapiens", 2011, "Yuval Harari"));
     listaespera.AdicionarNaFila(new Livro("Boys Of Tommen", 2020, "Chloe Walsh"));
     listaespera.imprimirListaDeEspera();

     Grafo grafoDeLivros = new Grafo();

     Livro livro1 = new Livro("Entendendo Algoritmos", 2017, "Aditya Y. Bhargava");
     Livro livro2 = new Livro("Sapiens", 2011, "Yuval Harari");
     Livro livro3 = new Livro("Codigo Limpo", 2008, "Robert C. Martin");
     Livro livro4 = new Livro("Game Of Thrones", 1997, "George G. Martin");
     Livro livro5 = new Livro("Harry Potter e a Pedra Filosofal", 2003, "J.K. Rowling");
     Livro livro6 = new Livro("Malala, a menina que queria ir para a escola", 2015, "Adriana Carranca");
     Livro livro7 = new Livro("1984", 1949, "George Owell");
     Livro livro8 = new Livro("Extraordinário", 2012, "Jaramillo Palacio");
     Livro livro9 = new Livro("Diário de um Banana", 2007, "Jeff Kinney");
     Livro livro10 = new Livro("A Menina que Roubava Livros", 2005, "Markus Zusak");


     grafoDeLivros.adicionarLivro(livro1);
     grafoDeLivros.adicionarLivro(livro2);
     grafoDeLivros.adicionarLivro(livro3);
     grafoDeLivros.adicionarLivro(livro4);
     grafoDeLivros.adicionarLivro(livro5);
     grafoDeLivros.adicionarLivro(livro6);
     grafoDeLivros.adicionarLivro(livro10);

     grafoDeLivros.adicionarRelacao(livro1, livro3); // Tecnologia
     grafoDeLivros.adicionarRelacao(livro2, livro4); // Ambos best-sellers
     grafoDeLivros.adicionarRelacao(livro4, livro5); // Ficção
     grafoDeLivros.adicionarRelacao(livro4, livro10); // Best Sellers
     grafoDeLivros.adicionarRelacao(livro6, livro10); // Fatos históricos

     grafoDeLivros.imprimirGrafo();
    }
}
