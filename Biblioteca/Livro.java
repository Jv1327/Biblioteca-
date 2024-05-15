public class Livro extends Material{
    private int numeroPaginas;

    public Livro() {

    }

    public Livro(int numeroPaginas) {
        super("Programação com Java", "Juliano guimaraes", 2025);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Autor: " + super.getAutor());
        System.out.println("Ano Publicação: " + super.getAnoPublicacao());
        System.out.println("Numero de Páginas: " + this.getNumeroPaginas());
    }
}
