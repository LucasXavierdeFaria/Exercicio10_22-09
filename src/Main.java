public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);

        livro.verificarDisponibilidade();  // Verifica se o livro está disponível
        livro.emprestar();                 // Empresta o livro
        livro.verificarDisponibilidade();  // Verifica novamente a disponibilidade
        livro.devolver();                  // Devolve o livro
        livro.verificarDisponibilidade();  // Verifica se o livro foi devolvido
    }
}
