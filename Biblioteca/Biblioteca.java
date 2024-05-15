public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Livro meuLivro = new Livro ();
        meuLivro.setTitulo("Desenvolvendo Projetos em Java");
        meuLivro.setAutor("João Victor");
        meuLivro.setAnoPublicacao(2024);
        meuLivro.setNumeroPaginas(254);
        meuLivro.exibirDetalhes();

        Revista minhaRevista = new Revista();
        minhaRevista.setTitulo("Linguagens de Programação que Atualmente está pagando muito Bem.");
        minhaRevista.setAutor("João Victor");
        minhaRevista.setAnoPublicacao(2024);
        minhaRevista.setEdicao(28);
        minhaRevista.setMesPublicacao("Outubro");
        minhaRevista.exibirDetalhes();
    }
}
