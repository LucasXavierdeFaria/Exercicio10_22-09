public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean emprestado;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = false; // Inicialmente, o livro está disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + titulo + "\" não estava emprestado.");
        }
    }

    // Método para verificar se o livro está disponível
    public void verificarDisponibilidade() {
        if (emprestado) {
            System.out.println("O livro \"" + titulo + "\" está emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" está disponível.");
        }
    }
}
